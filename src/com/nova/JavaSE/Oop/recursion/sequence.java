package com.nova.JavaSE.Oop.recursion;


/**
 * 已知 f(0)=1,f(1)=4,f(n+2) = 2f(n+1) +f(n),求f(10)
 */

public class sequence {
    public static void main(String[] args) {
        sequence fib = new sequence();
        System.out.println(fib.f(10));
    }

    public int f(int n) {
        if (n == 0) {
            return 1;
        } else if (n == 1) {
            return 4;
        } else {
            return 2 * f(n - 1) + f(n - 2);
        }
    }

}
