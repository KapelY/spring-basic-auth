package com.springsecurity.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HiController {

    @RequestMapping("/")
    public String hi() {
        return "hi.html";
    }
}
