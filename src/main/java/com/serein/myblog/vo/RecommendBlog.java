package com.serein.myblog.vo;

import lombok.Data;

@Data
public class RecommendBlog {
    private Long id;
    private String title;
    private String firstPicture;
    private boolean recommend;
}
