package com.joseph.training;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyApp {

  public static void main(String[] args) {
    ApplicationContext ctx = new AnnotationConfigApplicationContext(ConfigApp.class);
    UserService service = ctx.getBean(UserService.class);
    service.businessService();
  }

}
