package com.serein.myblog.controller;

import com.serein.myblog.service.MemoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class ArchiveShowController {
    @Autowired
    private MemoryService memoryService;

    @GetMapping("/archives")
    public String archive(Model model){
        model.addAttribute("memorys",  memoryService.listMemory());
        return "archives";
    }

}
