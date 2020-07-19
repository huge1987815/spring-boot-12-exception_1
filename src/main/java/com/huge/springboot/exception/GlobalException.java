/*
package com.huge.springboot.exception;

import lombok.Data;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

*/
/**
 * @Desc:全局异常
 * @author:huge
 * @create:2020-07-18 6:57
 *//*

@ControllerAdvice
public class GlobalException{
    @ExceptionHandler(value={java.lang.ArithmeticException.class})
    public ModelAndView ArithmeticException(Exception e){
        ModelAndView mv=new ModelAndView();
        mv.addObject("error",e.toString());
        mv.setViewName("suanshu");
        return mv;
    }
    @ExceptionHandler(value={java.lang.NullPointerException.class})
    public ModelAndView NullPointerException(Exception e){
        ModelAndView mv=new ModelAndView();
        mv.addObject("error",e.toString());
        mv.setViewName("500");
        return mv;
    }
}
*/
