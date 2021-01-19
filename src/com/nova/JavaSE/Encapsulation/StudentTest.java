package com.nova.JavaSE.Encapsulation;

public class StudentTest {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("张三");
        student.setAge(18);
        student.setMajor("物理学");

        student.eat();
        student.sleep();
        student.study();


        Creature creature = new Creature();
        System.out.println(creature.hashCode());
    }
}
