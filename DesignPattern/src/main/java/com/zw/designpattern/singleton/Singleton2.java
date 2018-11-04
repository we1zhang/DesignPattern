package com.zw.designpattern.singleton;

/**
 * 同步getInstance方法
 */
public class Singleton2 {

    private static Singleton2 instance;

    /**
     * 加入synchronized方法，迫使每个线程进入该方法前，要等待别的线程离开该方法
     * 也就是说，不会有两个线程进入该方法
     *
     * @return
     */
    public synchronized Singleton2 getInstance() {
        if (instance == null) {
            instance = new Singleton2();
        }
        return instance;
    }

    private Singleton2() {
    }
}
