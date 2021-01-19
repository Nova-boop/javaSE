package com.nova.JavaSE.Oop;

public class Order {
    public int orderPublic;
    int orderDefault;
    private int orderPrivate;

    public int getOrderPrivate() {
        return orderPrivate;
    }

    public void setOrderPrivate(int orderPrivate) {
        this.orderPrivate = orderPrivate;
    }

    public int getOrderDefault() {
        return orderDefault;
    }

    public void setOrderDefault(int orderDefault) {
        this.orderDefault = orderDefault;
    }

    public int getOrderPublic() {
        return orderPublic;
    }

    public void setOrderPublic(int orderPublic) {
        this.orderPublic = orderPublic;
    }
}
