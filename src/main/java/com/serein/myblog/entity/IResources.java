package com.serein.myblog.entity;

import lombok.Data;

import java.util.Date;

@Data
public class IResources {
    private Long id;
    private String resourceName;
    private String firstType;
    private String secondType;
    private String pictureAddress;
    private String resourceAddress;
    private String resourceDescription;
    private Date createTime;
    private Integer sort;
    private boolean published;
}
