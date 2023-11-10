package com.sparta.springauth;

import com.sparta.springauth.food.Food;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
    import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class BeanTest {

  @Autowired
  @Qualifier("pizza")//자동주입
  Food food;

//  @Autowired
//  Food chicken;

  @Test
  @DisplayName("Primary 와 Qualifier의 우선순위 확인")
  void test1() {
    food.eat();
//    pizza.eat();
//    chicken.eat();
  }

}
