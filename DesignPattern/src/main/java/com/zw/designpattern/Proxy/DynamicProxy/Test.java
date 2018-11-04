package com.zw.designpattern.Proxy.DynamicProxy;


import com.zw.designpattern.Proxy.StaticProxy.IHello;
import com.zw.designpattern.Proxy.StaticProxy.RealHello;

import java.lang.reflect.Proxy;

public class Test {

    public static void main(String[] args) {
        //将生成的字节码文件保存起来
        System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles","true");

        IHello hello = (IHello) Proxy.newProxyInstance(Test.class.getClassLoader(), new Class[]{IHello.class}, new DynamicProxyHandler(new RealHello()));
        hello.sayHello();

        hello.sayHi();
    }

}
