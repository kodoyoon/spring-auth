package com.sparta.springauth.food;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Chicken implements Food {
  @Override
  public void eat() {
    System.out.println("치킨을 먹습니다.");
  }
}
//좁은범위(Qulifier)가 넓은범위 보다 우선순위가 높다