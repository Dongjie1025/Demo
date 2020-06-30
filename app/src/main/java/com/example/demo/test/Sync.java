package com.example.demo.test;

public class Sync {
    private final Object lock = new Object();
    static volatile int x = 10;
    static volatile int j = 100;


    void a() {
        for (int i = 0; i < j; i++) {
            x++;
            System.out.print(x + "a\n");
        }
    }

    public synchronized void b() {
        for (int i = 0; i < j; i++) {
            x++;
            System.out.print(x + "b\n");
        }
    }

    public static synchronized void c() {
        for (int i = 0; i < j; i++) {
            x++;
            System.out.print(x + "c\n");
        }
    }

    public void d() {
        synchronized (lock) {
            for (int i = 0; i < j; i++) {
                x++;
                System.out.print(x + "d\n");
            }
        }
    }

    public void e() {
        synchronized (Sync.class) {
            for (int i = 0; i < j; i++) {
                x++;
                System.out.print(x + "e\n");
            }
        }
    }
}
