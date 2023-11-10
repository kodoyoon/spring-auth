package com.sparta.springauth.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class PasswordConfig { //passwordConfig

  @Bean
  public PasswordEncoder passwordEncoder() {
    return new BCryptPasswordEncoder(); //BCrypt 는 HASH 함수 비밀번호를 암호화해주는
  }
}