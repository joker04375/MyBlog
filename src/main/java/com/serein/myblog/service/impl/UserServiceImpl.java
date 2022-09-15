package com.serein.myblog.service.impl;

import com.serein.myblog.mapper.UserMapper;
import com.serein.myblog.entity.User;
import com.serein.myblog.service.UserService;
import com.serein.myblog.util.MD5Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public User checkUser(String username, String password) {
        User user = userMapper.findUserByUserNameAndPassword(username, MD5Utils.encode(password));
        return user;
    }
}
