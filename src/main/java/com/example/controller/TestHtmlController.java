package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author xiongtao
 * @version v1.0
 * @classDesc: 功能描述:()
 * @cratedate 2017/8/25 9:40
 * @copyright:善林(上海)金融信息服务有限公司
 */

@RequestMapping("/")
@Controller
public class TestHtmlController {

    @RequestMapping("/test")
    public String  test(){

        System.out.println("==========================================");
        return "demo1.html";
    }









}
