package com.zw.designpattern.Proxy.StaticProxy;

public class ProxyHello implements IHello {

    private IHello iHello;

    public ProxyHello(IHello iHello) {
        this.iHello = iHello;
    }

    @Override
    public void sayHello() {
        System.out.println("ProxyHello: start");
        iHello.sayHello();
        System.out.println("ProxyHello: end");
    }

    @Override
    public void sayHi() {
        System.out.println("ProxyHello: start");
        iHello.sayHi();
        System.out.println("ProxyHello: end");
    }
}
