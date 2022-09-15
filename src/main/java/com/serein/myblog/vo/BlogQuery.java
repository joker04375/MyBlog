package com.serein.myblog.vo;

import com.serein.myblog.entity.Type;
import lombok.Data;

import java.util.Date;

@Data
public class BlogQuery {
    private Long id;
    private String title;
    private Date createTime;
    private Date updateTime;
    private Boolean recommend;
    private Boolean published;
    private Long typeId;
    private Type type;

}
