package com.nova.JavaSE.Oop.bean;

import java.lang.String;

/**
 * Java Bean
 * 1. 方法是公共的
 * 2. 实现了一个空参构造
 * 3. 属性实现了 get 和 set 方法
 */

public class Customer {

    private String id;
    private Integer age;
    private String name;

    public Customer() {
    }

    public Customer(String id, Integer age, String name) {
        this.id = id;
        this.age = age;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
