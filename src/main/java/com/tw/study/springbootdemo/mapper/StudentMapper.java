package com.tw.study.springbootdemo.mapper;

import com.tw.study.springbootdemo.po.StudentPo;

import java.util.List;

/**
 * The interface Student mapper.
 *
 * @author xllong
 * @date 2018 /4/20
 */
public interface StudentMapper {
  /**
   * Add student int.
   *
   * @param studentPo 学生
   * @return 影响行数 int
   */
  int addStudent(StudentPo studentPo);



  /**
   * Query list.
   *
   * @return 所有学生 list
   */
  List<StudentPo> query();
}
