package com.zw.designpattern.Proxy.StaticProxy;

public class Test {

    public static void main(String[] args) {
        IHello hello=new RealHello();
        hello.sayHello();
        hello.sayHi();
        System.out.println("---------------");

        IHello proxyHello = new ProxyHello(new RealHello());
        proxyHello.sayHello();
        proxyHello.sayHi();
    }

}
