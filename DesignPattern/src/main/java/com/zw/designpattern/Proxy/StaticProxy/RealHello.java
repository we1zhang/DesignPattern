package com.zw.designpattern.Proxy.StaticProxy;

public class RealHello implements IHello {

    @Override
    public void sayHello() {
        System.out.println("RealHello: hello!");
    }

    @Override
    public void sayHi() {
        System.out.println("RealHello: Hi!");
    }
}
