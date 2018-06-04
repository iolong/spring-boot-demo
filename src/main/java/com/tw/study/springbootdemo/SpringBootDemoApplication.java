package com.tw.study.springbootdemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * boot strap
 * @author xllong
 * @date 2018-4-20
 */
@SpringBootApplication
@MapperScan("com.tw.study.springbootdemo.mapper")
public class SpringBootDemoApplication {

  /**
   * The entry point of application.
   *
   * @param args the input arguments
   */
  public static void main(String[] args) {
    SpringApplication.run(SpringBootDemoApplication.class, args);
  }
}
