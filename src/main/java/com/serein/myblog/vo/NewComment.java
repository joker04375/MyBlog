package com.serein.myblog.vo;

import lombok.Data;

@Data
public class NewComment {
    private Long id;
    private Long blogId;
    private String title;
    private String content;
}
