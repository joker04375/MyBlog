package com.serein.myblog.mapper;

import com.serein.myblog.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface UserMapper {
    /**
     * 根据用户名和密码查询用户
     * @param username
     * @param password
     * @return
     */
    User findUserByUserNameAndPassword(@Param("username") String username, @Param("password") String password);

    void insertUser(@Param("user") User user);
}
