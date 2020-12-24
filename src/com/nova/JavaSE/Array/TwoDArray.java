package com.nova.JavaSE.Array;

import java.util.Arrays;

/*
二维数组的使用
 */
public class TwoDArray {
    public static void main(String[] args) {
        // 定义 5*3 的数组
        int[][] arrays = new int[5][3];

        for (int i = 0; i < arrays.length; i++) {
            // 读取数组的内容
            System.out.println(Arrays.toString(arrays[i]));
            for (int j = 0; j < arrays[i].length; j++) {
                System.out.println(arrays[i][j]);
            }
        }
        //
        System.out.println(Arrays.deepToString(arrays));
    }
}
