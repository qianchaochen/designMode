package com.qcc.study.design.mediator;

/**
 * @author: qiancc
 * 2017年07月21日
 */
public class User2 extends User {

    public User2(Mediator mediator){
        super(mediator);
    }

    @Override
    public void work() {
        System.out.println("user2 execute work...");
    }
}