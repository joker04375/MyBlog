package com.serein.myblog.service;

import com.serein.myblog.entity.Message;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MessageService {
    //查询留言列表
    List<Message> listMessage();

    //保存留言
    int saveMessage(Message message,Message parentMessage);

    //删除留言
    void deleteMessage(Long id);

    Message getEmailByParentId(Long parentId);
}
