package com.joseph.training;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserService {

  @Transactional
  public void businessService() {
    System.out.println("Doing some technical stuff !");
  }
}
