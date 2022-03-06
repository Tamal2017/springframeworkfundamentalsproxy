package com.joseph.training;

public class MyApp {

  public static void main(String[] args) {
    UserService service = new Proxy(new UserServiceImpl());
    service.greet();
    service.greet();
    service.greet();
  }

}
