package com.zw.designpattern.ResponsibilityChain.simpleImpl;

/**
 * Created by 01369537 on 2018/11/2.
 */
public abstract class Handler {

    private Handler successor;

    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }

    public void execute() {
        handleProcess();
        if (this.successor != null) {
            this.successor.execute();
        }
    }

    protected abstract void handleProcess();

}
