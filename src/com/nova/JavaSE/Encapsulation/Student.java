package com.nova.JavaSE.Encapsulation;

public class Student extends Person {

    private String major;

    public Student() {
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public Student(String major) {

        this.major = major;
    }

    public void study() {
        System.out.println("study");
    }
}
