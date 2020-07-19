/*
package com.huge.springboot.exception;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.handler.SimpleMappingExceptionResolver;

import java.util.Properties;


*/
/**
 * @Desc:使用SimpleMappingExceptionResolver作全局异常处理
 * @author:huge
 * @create:2020-07-18 7:50
 *//*

@Configuration
public class GbException {
    @Bean
    public SimpleMappingExceptionResolver getSimpleMappingExceptionResolver(){
        SimpleMappingExceptionResolver resolver=new SimpleMappingExceptionResolver();
        Properties mapping=new Properties();
        */
/***
         * 参数一：异常名称，必须是异常全称
         * 参数二：视图名称
         *//*

       mapping.put("java.lang.NullPointerException","500");
       mapping.put("java.lang.ArithmeticException","suanshu");
       resolver.setExceptionMappings(mapping);
       return resolver;
    }
}
*/
