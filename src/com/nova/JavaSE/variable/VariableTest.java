package com.nova.JavaSE.variable;

/**
 * 1. �������͵�����
 * - byte short int long float double
 * 2. ǿ������ת��
 * ǿ������ת�����ܻ���־�����ʧ
 */

public class VariableTest {
    public static void main(String[] args) {

        // �������͵�����
        byte b1 = 2;
        int i1 = 128;
        int i2 = b1 + i1;
        System.out.println(i2);

        // ����ǿ��ת�����ֵľ�����ʧ
        double height = 192.78;
        int heightInt = (int) height;
        System.out.println(heightInt);
    }
}
