package com.souvc.spring;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller //@Controller注解声明Controller组件，这样可以使得Controller定义更加灵活，可以不用实现Controller接口，请求处理的方法也可以灵活定义。
@RequestMapping("/spring")  //@RequestMapping可以用在类定义和方法定义上，它标明这个类或方法与哪一个客户请求对应。
public class HelloController{

    @RequestMapping("/hello.form")
    public String execute() throws Exception {
        return "hello";
    }
}