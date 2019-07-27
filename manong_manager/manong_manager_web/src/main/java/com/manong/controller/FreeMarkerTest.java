package com.manong.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FreeMarkerTest {
    @RequestMapping("/hello")
    public String sayhello(Model model){
        model.addAttribute("name","zkz");
        return "hello";
    }
    @RequestMapping("/hi")
    public String sayhi(Model model){
        model.addAttribute("name","zkz");
        return "hi";
    }
}
