package com.serein.myblog.entity;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Type {
    private Long id;
    private String name;
    private List<Blog> blogs = new ArrayList<>();
}
