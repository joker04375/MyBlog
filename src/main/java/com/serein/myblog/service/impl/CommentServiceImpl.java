package com.serein.myblog.service.impl;

import com.serein.myblog.entity.Comment;
import com.serein.myblog.mapper.BlogMapper;
import com.serein.myblog.mapper.CommentMapper;
import com.serein.myblog.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class CommentServiceImpl implements CommentService {
    @Autowired
    private CommentMapper commentMapper;

    @Autowired
    private BlogMapper blogMapper;

    //存放迭代找出的所有子代的集合
    private List<Comment> tempReplays = new ArrayList<>();

    /**
     * 查询父评论
     * @param blogId
     * @return
     */
    @Override
    public List<Comment> listCommentByBlogId(Long blogId) {
        //查询出父节点
        List<Comment> comments = commentMapper.findByBlogIdParentIdNull(blogId, Long.parseLong("-1"));

        for(Comment comment : comments){
            Long id = comment.getId();
            String parentNickname1 = comment.getNickname();
            List<Comment> childComments = commentMapper.findByBlogIdParentIdNotNull(blogId,id);

            //查询出子评论
            combineChildren(blogId, childComments, parentNickname1);
            comment.setReplyComments(tempReplays);
            tempReplays = new ArrayList<>();
        }

        return comments;
    }

    /**
     * 查询子评论
     * @param blogId
     * @param childComments 所有子评论
     * @param parentNickname1 父评论姓名
     */
    private void combineChildren(Long blogId, List<Comment> childComments, String parentNickname1) {
        //判断是否有一级子评论
        if(childComments.size() > 0){
            //循环找出子评论的id
            for(Comment childComment : childComments){
                String parentNickname = childComment.getNickname();
                childComment.setParentNickname(parentNickname1);
                tempReplays.add(childComment);
                Long childId = childComment.getId();
                //查询出子二级评论
                recursively(blogId, childId, parentNickname);
            }
        }
    }

    /**
     * 循环迭代找出子集回复
     * @param blogId
     * @param childId 子评论id
     * @param parentNickname1 子评论姓名
     */
    private void recursively(Long blogId, Long childId, String parentNickname1) {
        //根据子一级评论的id找到子二级评论
        List<Comment> replayComments = commentMapper.findByBlogIdAndReplayId(blogId,childId);

        if(replayComments.size() > 0){
            for(Comment replayComment : replayComments){
                String parentNickname = replayComment.getNickname();
                replayComment.setParentNickname(parentNickname1);
                Long replayId = replayComment.getId();
                tempReplays.add(replayComment);
                recursively(blogId,replayId,parentNickname);
            }
        }
    }

    @Override
    public int saveComment(Comment comment, Comment parentComment) {
        comment.setCreateTime(new Date());
        int comments = commentMapper.saveComment(comment);

//        //文章评论计数
//        blogMapper.getCommentCountById(comment.getBlogId());

//        // 判断是否有父评论，有的话就发送邮件
//        if(!StringUtils.isEmpty(parentComment)){
//            String parentNickname = parentComment.getNickname();
//            String nickName = comment.getNickname();
//            String comtent = "亲爱的" + parentNickname + "，您在【ONESTARの客栈】的评论收到了来自" + nickName + "的回复！内容如下：" + "\r\n" + "\r\n" +  comment.getContent();
//            String parentEmail = parentComment.getEmail();
//
//            // 发送邮件
//            SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
//            simpleMailMessage.setSubject("ONESTARの客栈评论回复");  //主题
//            simpleMailMessage.setText(comtent);   //内容
//            simpleMailMessage.setTo(parentEmail); //接收者的邮箱
//            simpleMailMessage.setFrom("onestaryxk@163.com");//发送者邮箱
//            javaMailSender.send(simpleMailMessage);
//        }

        return comments;
    }

    @Override
    public void deleteComment(Comment comment, Long id) {
        commentMapper.deleteComment(id);
        blogMapper.getCommentCountById(comment.getBlogId());
    }

    @Override
    public Comment getEmailByParentId(Long parentId) {
        return commentMapper.getEmailByParentId(parentId);
    }
}
