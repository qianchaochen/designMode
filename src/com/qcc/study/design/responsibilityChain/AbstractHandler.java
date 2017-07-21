package com.qcc.study.design.responsibilityChain;

/**
 * @author: qiancc
 * 2017年07月21日
 */
public abstract class AbstractHandler {

    private Handler handler;

    public Handler getHandler() {
        return handler;
    }

    public void setHandler(Handler handler) {
        this.handler = handler;
    }
}
