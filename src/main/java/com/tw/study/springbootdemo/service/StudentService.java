package com.tw.study.springbootdemo.service;

import com.tw.study.springbootdemo.po.StudentPo;

import java.util.List;

/**
 * The interface Student service.
 *
 * @author xllong
 * @date 2018 /4/20
 */
public interface StudentService {
  /**
   * Add student student po.
   *
   * @param name   名字
   * @param gender 性别
   * @return 学生 student po
   */
  StudentPo addStudent(String name, Boolean gender);

  /**
   * Query list.
   *
   * @return the list
   */
  List<StudentPo> query();
}
