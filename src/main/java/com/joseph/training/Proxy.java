package com.joseph.training;

public class Proxy implements UserService {

  private UserService delegate;

  public Proxy(UserService delegate) {
    this.delegate = delegate;
  }

  @Override
  public void greet() {
    Intercept();
  }

  @Override
  public void greetInFrench() {
    Intercept();
  }

  private void Intercept() {
    System.out.println("I just want to say...");
    delegate.greet();
  }

}
