package com.zw.designpattern.ResponsibilityChain.simpleImpl;

/**
 * Created by 01369537 on 2018/11/2.
 */
public class Client {

    static class HandlerA extends Handler{
        @Override
        protected void handleProcess() {
            System.out.println("handle by A");
        }
    }

    static class HandlerB extends Handler{
        @Override
        protected void handleProcess() {
            System.out.println("handle by B");
        }
    }

    static class HandlerC extends Handler{
        @Override
        protected void handleProcess() {
            System.out.println("handle by C");
        }
    }

    public static void main(String[] args) {
        Handler handlerA = new HandlerA();
        Handler handlerB = new HandlerB();
        Handler handlerC = new HandlerC();

        handlerA.setSuccessor(handlerB);
        handlerB.setSuccessor(handlerC);

        handlerA.execute();

        //这种方案需要我们自己一个一个地set下一个调用的对象，比较麻烦
    }

}
