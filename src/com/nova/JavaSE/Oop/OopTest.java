package com.nova.JavaSE.Oop;

public class OopTest {

    public static void main(String[] args) {
        Personal personal = new Personal();
        personal.age = 10;
        System.out.println(personal.age);

        personal.eat();
    }

}


class Personal {
    String name;
    Integer age;
    Boolean isMale;

    public void eat() {
        System.out.println("吃东西");
    }

    public void sleep() {
        System.out.println("睡觉");
    }

    public void talk() {
        System.out.println("讲话");
    }
}
