package com.example.demo.test;

public class B {

    void test1() {
        System.out.print("test1\n");
    }

    synchronized void test2() {
        System.out.print("test2\n");
    }

    void test3() {
        synchronized (this) {
            System.out.print("test3\n");
        }
    }

    static synchronized void test4() {
        System.out.print("test4\n");
    }

    void test5() {
        synchronized (B.class) {
            System.out.print("test5\n");
        }

    }
}
