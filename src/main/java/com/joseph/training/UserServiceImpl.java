package com.joseph.training;

public class UserServiceImpl implements UserService {

  @Override
  public void greet() {
    System.out.println("Hello everyone !");
  }

  @Override
  public void greetInFrench() {
    System.out.println("Salut tout le monde !");
  }
}
