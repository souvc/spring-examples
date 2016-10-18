package com.souvc.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan
public class Application {

    @Bean
    MessageService mockMessageService() {
        return new MessageService() {
            public String getMessage() {
              return "Hello ,Welcome Spring World!";
            }
        };
    }

  public static void main(String[] args) {
      ApplicationContext context =  new AnnotationConfigApplicationContext(Application.class);
      System.out.println(context);
      
      MessagePrinter printer = context.getBean(MessagePrinter.class);
      printer.printMessage();
  }
}