package com.jingda.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.persistence.Temporal;

@RequestMapping("/")
@Controller
public class IndexController {
    @RequestMapping("/")
    public String index() {
        return "test";
    }

}
