package com.as.springbootjenkins.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 * 描述：
 * 创建人：飘
 * 创建时间：2025/2/13
 **/
@Controller
public class TestController {

    @GetMapping("/index")
    public String index()
    {

        return  "tests";
    }
    @ResponseBody
    @GetMapping("/demo")
    public String demo()
    {
        return  "demo..";
    }
}
