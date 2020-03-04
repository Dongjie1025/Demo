package com.example.demo.mode;

/**
 * 单例模式
 */
public class SingletonMode {
    private volatile static SingletonMode mInstance = null;
    private static SingletonMode mInstance1 = null;
    private static SingletonMode mInstance2;

    private SingletonMode() {
    }

    // Double Check (双重检验锁模式就是为了防止多线程调用单例时加入synchronized防止单例被多次实例化加的同步锁
    // 第一个判空是为了不必要的调用同步锁，浪费资源，第二个判空是为了不必要的重复实例化对象)
    public static SingletonMode getInstance() {
        if (mInstance == null) {
            synchronized (SingletonMode.class) {
                if (mInstance == null) {
                    return mInstance = new SingletonMode();
                }
            }
        }
        return mInstance;
    }

    // hungry (饿汉模式就是开始提前实例化本类)
    public static SingletonMode getInstance1() {
        if (mInstance1 == null) {
            return mInstance1 = new SingletonMode();
        }
        return mInstance1;
    }

    // idler (懒汉模式就是等调用的时候在实例化本类)
    public static SingletonMode getInstance2() {
        if (mInstance2 == null) {
            return mInstance2 = new SingletonMode();
        }
        return mInstance2;
    }

    // static click (静态内部类就是在内部维护一个静态内部类防止在类初始化时不去实例化对象，只有在调用getInstance3（）
    // 方法时才去实例化对象，相较于double check代码更简洁，浪费资源更少，同时也保护了线程安全和单例的唯一性)
    public static SingletonMode getInstance3() {
        return SingletonHolder.mInstance3;
    }

    private static class SingletonHolder {
        private static final SingletonMode mInstance3 = new SingletonMode();
    }
}
