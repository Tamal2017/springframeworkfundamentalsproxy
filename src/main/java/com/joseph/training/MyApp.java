package com.joseph.training;

import org.springframework.aop.framework.ProxyFactoryBean;

public class MyApp {

  public static void main(String[] args) {
    IUser user = new User();
    ProxyFactoryBean proxyFactoryBean = new ProxyFactoryBean();
    proxyFactoryBean.setTarget(user);
    IUser proxy = (IUser) proxyFactoryBean.getObject();
    proxy.greet();
  }

}
