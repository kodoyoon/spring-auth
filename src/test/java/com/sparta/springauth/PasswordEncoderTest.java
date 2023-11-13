package com.sparta.springauth;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootTest
public class PasswordEncoderTest {

  @Autowired //PasswordEncoder 주입 받아오고 있다.
  PasswordEncoder passwordEncoder;

  @Test
  @DisplayName("수동 등록한 passwordEncoder를 주입 받아와 문자열 암호화")
  void test1() {
    String password = "Robbie's password";

    // 암호화
    String encodePassword = passwordEncoder.encode(password); //암호화할 문자열 넣어줌.
    System.out.println("encodePassword = " + encodePassword); // 진짜로 찍어보는거

    String inputPassword = "Robbie";

    // 복호화를 통해 암호화된 비밀번호와 비교
    boolean matches = passwordEncoder.matches(inputPassword, encodePassword); //matches 는 비교하는 메서드, matches 내부에서 자동으로 비교를 해줌
    System.out.println("matches = " + matches); // 암호화할 때 사용된 값과 다른 문자열과 비교했기 때문에 false
  }
}