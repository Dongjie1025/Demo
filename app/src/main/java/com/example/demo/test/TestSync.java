package com.example.demo.test;

public class TestSync {


    public static void main(String[] arg) {
        Test1 test1 = new Test1();
//        new Thread(test1::test,"AAA").start();
    }

    static class Test1 {
        void test() {
            synchronized (this) {
                System.out.print("这只是一个测试！！");
            }
        }
    }
}
