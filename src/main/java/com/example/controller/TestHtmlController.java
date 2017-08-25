package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@RequestMapping("/")
@Controller
public class TestHtmlController {

    @RequestMapping("/test")
    public String  test(){

        System.out.println("==========================================");
        return "demo1.html";
    }









}
