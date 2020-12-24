package com.nova.JavaSE.Train;

/**
 * 杨辉三角
 * 使用二维数组实现杨辉三角,输出10行内容
 */
public class Triangle {
    public static void main(String[] args) {

        int row = 10;
        int[][] triangle = new int[row][row];
        for (int i = 0; i < triangle.length; i++) {
            for (int j = 0; j <= i; j++) {
                if (j == 0 | j == i) {
                    triangle[i][j] = 1;
                } else {
                    triangle[i][j] = triangle[i - 1][j - 1] + triangle[i - 1][j];
                }
                System.out.print(triangle[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
