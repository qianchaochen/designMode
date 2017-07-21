package com.qcc.study.design.mediator;

/**
 * @author: qiancc
 * 2017年07月21日
 */
public abstract class User {
    private Mediator mediator;

    public User(Mediator mediator){
        this.mediator = mediator;
    }

    public Mediator getMediator() {
        return mediator;
    }

    public abstract void work();
}
