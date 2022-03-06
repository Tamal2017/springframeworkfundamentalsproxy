package com.joseph.training;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class TimestampLoggingProxy implements InvocationHandler {

  private Object delegate;

  private TimestampLoggingProxy(Object delegate) {
    this.delegate = delegate;
  }

  public static Object getProxyFor(Object o) {
    return Proxy.newProxyInstance(o.getClass().getClassLoader(), o.getClass().getInterfaces(),
        new TimestampLoggingProxy(o));
  }

  @Override
  public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
    System.out.println(String.format("log : " + LocalDateTime.now().format(DateTimeFormatter.ISO_LOCAL_DATE_TIME )));
    return method.invoke(delegate, args);
  }
}
