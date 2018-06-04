package com.tw.study.springbootdemo.controller;

import com.tw.study.springbootdemo.po.StudentPo;
import com.tw.study.springbootdemo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author xllong
 * @date 2018/4/17
 */
@RestController
@RequestMapping("/test")
public class TestController {

  @Autowired
  private StudentService studentService;

  @RequestMapping("say")
  @ResponseBody
  public String say() {
    System.out.println("13aaa");
    return "hello world!da";

  }

  @RequestMapping("add")
  @ResponseBody
  public StudentPo add(String name, Boolean gender) {
    return studentService.addStudent(name, gender);
  }

  @RequestMapping("query")
  @ResponseBody
  public List<StudentPo> query() {
    return studentService.query();
  }
}







