package com.tw.study.springbootdemo;

import com.tw.study.springbootdemo.mapper.StudentMapper;
import com.tw.study.springbootdemo.po.StudentPo;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootDemoApplicationTests {

  @Autowired
  private StudentMapper studentMapper;


  @Test
  public void contextLoads() {


    List<StudentPo> list = studentMapper.query();
    Assert.assertNotNull(list);
    Assert.assertTrue(list.size() > 0);
    Assert.assertEquals(1, 1);
  }

}
