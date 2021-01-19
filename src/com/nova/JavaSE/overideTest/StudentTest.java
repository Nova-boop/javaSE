package com.nova.JavaSE.overideTest;


import java.util.Date;

/**
 * 方法的重写; override /overwrite
 */

public class StudentTest {

    public static void main(String[] args) {
        Student student = new Student();

        student.eat();
        student.walk(10);
        student.study();

        student.show();

        String str1 = new String("zhang san");
        String str2 = new String("zhang san");

        System.out.println(str1.equals(str2));

    }
}
