package com.as.springbootjenkins.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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

        return  "test";
    }
    @ResponseBody
    @GetMapping("/demo")
    public String demo()
    {
        return  "demo..";
    }
    @ResponseBody
    @GetMapping("/test/{value}")
    public String demo(@PathVariable("value") Integer value)
    {
        int a=100/value;
        return  "value:"+a;
    }
//    @ResponseBody
//    @GetMapping("/metrics")
//    public String metrics()
//    {
//        return  "demo..metrics";
//    }
}
