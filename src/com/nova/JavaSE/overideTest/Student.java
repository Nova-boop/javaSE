package com.nova.JavaSE.overideTest;

import java.util.Objects;

public class Student extends Person {

    private String major;
    private final int id = 1002;

    public Student() {
    }

    public Student(String major) {
        this.major = major;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public void study() {
        System.out.println("study");
    }

    public void eat() {
        System.out.println("多吃些好吃的东西");
    }

    public void show() {
        System.out.println("id= " + super.id);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Student)) {
            return false;
        }
        Student obj = (Student) o;
        return obj.id == this.id && obj.major.equals(this.major);
    }

    @Override
    public int hashCode() {
        return Objects.hash(major, id);
    }


}
