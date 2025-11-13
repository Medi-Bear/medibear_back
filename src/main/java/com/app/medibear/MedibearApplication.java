package com.app.medibear;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class MedibearApplication {

  public static void main(String[] args) {

    String raw = "1234";


    BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
    System.out.println("matches = " + encoder.encode(raw));

    SpringApplication.run(MedibearApplication.class, args);
  }

}
