package com.nova.JavaSE.Test;

public class superClass {

    public static void main(String[] args) {
        Order order = new Order();
        System.out.println(order.getClass().getSuperclass());

        Object o = new Object();
    }
}


class Order{

}