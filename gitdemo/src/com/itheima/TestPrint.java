package com.itheima;

public class TestPrint {
    public static void main(String[] args) {
        System.out.println("hello");
        System.out.println("world");
        count(5);
    }

    public static void count(int a) {
        int i = 10;
        i += 20;
        System.out.println(i + a);
    }
}
