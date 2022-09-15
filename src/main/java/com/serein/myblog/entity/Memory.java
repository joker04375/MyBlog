package com.serein.myblog.entity;

import lombok.Data;

import java.util.Date;

@Data
public class Memory {
    private Long id;
    private Date createTime;
    private String pictureAddress;
    private String memory;
}
