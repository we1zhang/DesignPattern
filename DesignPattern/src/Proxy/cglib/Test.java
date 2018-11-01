package Proxy.cglib;

import Proxy.StaticProxy.IHello;
import Proxy.StaticProxy.RealHello;
import net.sf.cglib.proxy.Enhancer;

public class Test {

    public static void main(String[] args) {

        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(RealHello.class);
        enhancer.setCallback(new DemoMethodInterceptor());

        IHello hello = (IHello) enhancer.create();
        hello.sayHi();
        hello.sayHello();
    }

}
