package com.huge.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @Desc:自定义错误页面
 * @author:huge
 * @create:2020-07-18 6:03
 */
@Controller
public class ExceptionController {
    @RequestMapping("show")
    public String index(Model model){
        String len=null;
        len.length();
        return "500";
    }
    @RequestMapping("ss")
    public String ss(){
        int i=10/0;
        return "suanshu";
    }

}
