package com.qcc.study.design.mediator;

/**
 * @author: qiancc
 * 2017年07月21日
 */
public class User1 extends User {

    public User1(Mediator mediator){
        super(mediator);
    }

    @Override
    public void work() {
        System.out.println("user1 execute work...");
    }
}
