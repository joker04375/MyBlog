package com.serein.myblog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MusicController {
    @GetMapping("/music")
    public String about() {
        return "music";
    }

}
