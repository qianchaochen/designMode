package com.qcc.study.design.observer;

/**
 * @author: qiancc
 * 2017年07月20日
 */
public class Observer1 implements Observer {
    @Override
    public void update() {
        System.out.println("observer1 has received");
    }
}
