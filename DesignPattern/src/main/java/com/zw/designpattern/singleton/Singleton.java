package com.zw.designpattern.singleton;

/**
 * 双重检查加锁
 * 注重性能，减少getInstance 的时间耗费
 */
public class Singleton {

    /**
     * volatile 确保当INSTANCE被初始化成Singleton实例时，多个线程正确的处理INSTANCE变量；
     */
    private volatile static Singleton INSTANCE;

    public static Singleton getInstance() {
        if (INSTANCE == null) {
            synchronized (Singleton.class) {
                if (INSTANCE == null) {
                    INSTANCE = new Singleton();
                }
            }
        }
        return INSTANCE;
    }

    private Singleton() {
    }
}
