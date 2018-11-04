package com.zw.designpattern.ResponsibilityChain.chainedImpl;

/**
 * Created by 01369537 on 2018/11/2.
 */
public abstract class ChainedHandler {

    public void execute(Chain chain) {
        handleProcess();
        chain.proceed();
    }

    protected abstract void handleProcess();

}
