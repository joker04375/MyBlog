package com.serein.myblog.vo;

import lombok.Data;

import java.util.Date;
@Data
public class FirstPageBlog {
    //博客信息
    private Long id;
    private String title;
    private String firstPicture;
    private Integer views;
    private Integer commentCount;
    private Date createTime;
    private Date updateTime;
    private String description;

    //分类名称
    private String typeName;
    //用户名
    private String nickname;
    //用户头像
    private String avatar;
}
