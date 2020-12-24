package com.nova.JavaSE.variable;

/**
 * 1. 数据类型的提升
 * - byte short int long float double
 * 2. 强制类型转换
 * 强制类型转换可能会出现精度损失
 */

public class VariableTest {
    public static void main(String[] args) {

        // 数据类型的提升
        byte b1 = 2;
        int i1 = 128;
        int i2 = b1 + i1;
        System.out.println(i2);

        // 类型强制转换出现的精度损失
        double height = 192.78;
        int heightInt = (int) height;
        System.out.println(heightInt);
    }
}
