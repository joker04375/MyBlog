package com.serein.myblog;

import com.serein.myblog.entity.Blog;
import com.serein.myblog.entity.Picture;
import com.serein.myblog.entity.Type;
import com.serein.myblog.mapper.BlogMapper;
import com.serein.myblog.mapper.PictureMapper;
import com.serein.myblog.mapper.TypeMapper;
import com.serein.myblog.mapper.UserMapper;
import com.serein.myblog.entity.User;
import com.serein.myblog.util.MD5Utils;
import com.serein.myblog.vo.BlogQuery;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class MyblogApplicationTests {
    @Autowired
    private UserMapper userMapper;

    @Autowired
    private BlogMapper blogMapper;

    @Autowired
    private TypeMapper typeMapper;

    @Autowired
    private PictureMapper pictureMapper;
    /**
     * 创建主用户
     */
    @Test
    void generateUser() {
        String username = "Serein";
        String encode = MD5Utils.encode("551898");
        User user = new User();
        user.setUserName(username);
        user.setPassword(encode);
        userMapper.insertUser(user);
        System.out.println(encode);
    }

    @Test
    void test(){
//        List<Picture> pictures = pictureMapper.listPicture();
//        System.out.println(pictures.get(0));
        List<Type> allTypeAndBlog = typeMapper.getAllTypeAndBlog();
        System.out.println(allTypeAndBlog.size());
        System.out.println(allTypeAndBlog.get(0));


//        List<Type> allType = typeMapper.getAllType();
//        System.out.println(allType.get(0));
//        List<BlogQuery> allBlogQuery = blogMapper.getAllBlogQuery();
//        for (BlogQuery blogQuery: allBlogQuery){
//            System.out.println(blogQuery);
//            System.out.println(blogQuery.getType());
//        }
    }

}
