package com.joseph.training;

public class MyApp {

  public static void main(String[] args) throws InterruptedException {
    UserService service = (UserService) TimestampLoggingProxy.getProxyFor(new UserServiceImpl());
    service.greet();
    Thread.sleep(1000);
    service.greetInFrench();
    Thread.sleep(1000);
    service.greetInSpanish();
  }

}
