package com.serein.myblog.entity;

import lombok.Data;

import java.util.Date;

@Data
public class User {
    private Long id;
    private String nickname;
    private String userName;
    private String password;
    private String email;
    private String avatar;
    private Integer type;
    private Date createTime;
    private Date updateTime;
}
