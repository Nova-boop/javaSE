package com.nova.JavaSE.Oop.recursion;


/**
 * 求1-n 的积
 */
public class sumProduct {
    public static void main(String[] args) {
        sumProduct sumProduct = new sumProduct();
        System.out.println(sumProduct.Product(10));

    }

    private int Product(int num) {
        if (num == 1) {
            return 1;
        } else {
            return num * Product(num - 1);
        }
    }
}
