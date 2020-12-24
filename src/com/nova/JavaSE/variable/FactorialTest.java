package com.nova.JavaSE.variable;

public class FactorialTest {
    public static void main(String[] args) {
        // 10的阶乘
        int i = 1;
        int n = 1;

        while (i <= 10) {
            n = n * i;
            i++;
        }
        System.out.println(n);
        forTest();
        testForeach();

    }

    private static void forTest(){
        int result = 0;
        for (int i = 1;i<=10;i++){
            result+=i;
        }
        System.out.println(result);
    }



    private static void testForeach(){
        int[] numbers = { 43, 32, 53, 54, 75, 7, 10 };
        for (int number : numbers) {
            System.out.println(number);
        }
    }


}
