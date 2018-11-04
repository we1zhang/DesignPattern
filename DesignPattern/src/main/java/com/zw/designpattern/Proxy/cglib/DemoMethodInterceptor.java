package com.zw.designpattern.Proxy.cglib;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class DemoMethodInterceptor implements MethodInterceptor {

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("cglib. MethodInterceptor: start!");
        Object result = methodProxy.invokeSuper(o,objects);
        System.out.println("cglib. MethodInterceptor: end!");
        return result;
    }
}


