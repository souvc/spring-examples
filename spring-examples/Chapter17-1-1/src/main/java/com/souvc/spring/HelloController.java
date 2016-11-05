package com.souvc.spring;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloController implements Controller{

    public ModelAndView handleRequest(HttpServletRequest req,HttpServletResponse res) throws Exception {
        System.out.println("处理hello.form请求");
        ModelAndView mv = new ModelAndView("hello");
        return mv;//调用hello.jsp
    } 
}