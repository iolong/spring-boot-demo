package com.tw.study.springbootdemo.service.impl;

import com.tw.study.springbootdemo.service.StudentService;
import com.tw.study.springbootdemo.mapper.StudentMapper;
import com.tw.study.springbootdemo.po.StudentPo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author xllong
 * @date 2018/4/20
 */
@Service
public class StudentServiceImpl implements StudentService {


  private final StudentMapper studentMapper;

  @Autowired
  public StudentServiceImpl(StudentMapper studentMapper) {
    this.studentMapper = studentMapper;
  }

  @Override
  public StudentPo addStudent(String name, Boolean gender) {
    StudentPo po = new StudentPo();
    po.setName(name);
    po.setGender(gender);

    int count = studentMapper.addStudent(po);
    if (count>0){
      return po;
    }
    return null;
  }

  @Override
  public List<StudentPo> query() {
    return studentMapper.query();
  }
}
