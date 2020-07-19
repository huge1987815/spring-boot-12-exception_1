package com.huge.springboot.exception;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Desc:写一个类实现 HandlerExceptionResolver接口做全局异常处理
 * @author:huge
 * @create:2020-07-19 7:17
 */
@Configuration
public class HandlerException implements HandlerExceptionResolver {

    @Override
    public ModelAndView resolveException(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) {
        ModelAndView mv=new ModelAndView();
        //判断不同异常类型，做不同类型异常跳转
        if(e instanceof ArithmeticException){
            mv.setViewName("suanshu");
        }
        if(e instanceof NullPointerException){
            mv.setViewName("500");
        }
        mv.addObject("error",e.toString());
        return mv;
    }
}
