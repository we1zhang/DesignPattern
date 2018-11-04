package com.zw.designpattern.ResponsibilityChain.chainedImpl;

import java.util.List;

/**
 * Created by 01369537 on 2018/11/2.
 */
public class Chain {

    private List<ChainedHandler> handlers;
    private int index = 0;

    public Chain(List<ChainedHandler> handlers) {
        this.handlers = handlers;
    }

    public void proceed() {
        if (index >= handlers.size()) {
            return;
        }
        handlers.get(index++).execute(this);
    }

}
