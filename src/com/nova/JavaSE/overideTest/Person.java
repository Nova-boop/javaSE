package com.nova.JavaSE.overideTest;

public class Person {
    private String name;
    private int age;
    public int  id = 1001;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void eat() {
        System.out.println("吃饭");
    }

    public void sleep() {
        System.out.println("睡觉");
    }

    public void walk(int step) {
        System.out.println("walk: " + step + " steps");
    }
}
