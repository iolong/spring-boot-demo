package com.tw.study.springbootdemo.po;

/**
 * @author xllong
 * @date 2018/4/20
 */
public class StudentPo {

  private Long id;
  private Boolean gender;
  private String name;
  private String desc;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Boolean getGender() {
    return gender;
  }

  public void setGender(Boolean gender) {
    this.gender = gender;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getDesc() {
    return desc;
  }

  public void setDesc(String desc) {
    this.desc = desc;
  }
}
