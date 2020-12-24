package com.nova.JavaSE.Array;


/**
 * 1. 数组数组的概述
 * 多个相同类型的数据按照一定顺序排列的集合,并使用一个名字命名,并通过编号进行统一管理

 * 2. 数组的特点:
     * 1. 数组是有序排列的
     * 2. 数组属于引用数据类型,数据的元素既可以是基本数据类型,也可以是引用数据类型
     * 3. 数组的长度是固定的,一旦确定不能进行修改
     * 4.创建的数组对象在内存空间的是连续的

 * 3. 一维数组的使用
     * 1. 一位数组的声明和初始化
     * 2. 调用数组的指定位置的元素
     * 3.获取数组的长度
 * 4. 遍历数组
 * 5. 数组元素的默认初始值
     * String 数组 默认值为 null;
     * int 数组默认值为0
     * float 数组默认值为0.0
     * boolean 数组默认值为false
 * 6. 数组的内存解析
 */

public class ArrayTest {

    public static void main(String[] args) {

        // 数组的声明及初始化;   -- 静态初始化
        int[] ids = new int[]{1001, 1002, 1003, 1004};
        // 动态初始化,数组的初始化和数组的元素的赋值操作分开进行
        String[] names = new String[5]; // 5 代表数组的长度

        names[0] = "zhang san";
        names[1] = "lucy";
        names[2] = "jack";

        // 使用索引获取数组中的元素,索引从0开始,到数组长度-1结束
        System.out.println(ids[1]);

        // 获取数组的长度
        System.out.println(names.length);

        // 遍历数组
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
    }
}


