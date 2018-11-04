package com.zw.designpattern.ResponsibilityChain.chainedImpl;

import java.util.Arrays;
import java.util.List;

/**
 * Created by 01369537 on 2018/11/2.
 */
public class ChainedClient {
    static class HandlerA extends ChainedHandler{
        @Override
        protected void handleProcess() {
            System.out.println("handle by a");
        }
    }

    static class HandlerB extends ChainedHandler{
        @Override
        protected void handleProcess() {
            System.out.println("handle by b");
        }
    }

    static class HandlerC extends ChainedHandler{
        @Override
        protected void handleProcess() {
            System.out.println("handle by c");
        }
    }

    public static void main(String[] args) {
        List<ChainedHandler> handlers = Arrays.asList(new HandlerA(),new HandlerB(),new HandlerC());
        Chain chain = new Chain(handlers);
        chain.proceed();
    }

}
