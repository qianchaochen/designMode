package com.qcc.study.design.mediator;

/**
 * @author: qiancc
 * 2017年07月21日
 */
public class TestMediator {

    public static void main(String[] args) {

        Mediator mediator = new MyMediator();
        mediator.createMediator();
        mediator.workall();
    }

}
