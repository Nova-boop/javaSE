package com.nova.JavaSE.Oop.recursion;

/**
 * 递归求和
 */
public class sumCount {
    public static void main(String[] args) {
        sumCount sumCount = new sumCount();

        System.out.println(sumCount.sum(10));
    }

    private int sum(int num) {
        if (num == 1) {
            return 1;
        } else {
            return num + sum(num - 1);
        }
    }
}
