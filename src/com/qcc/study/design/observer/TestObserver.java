package com.qcc.study.design.observer;

/**
 * @author: qiancc
 * 2017年07月20日
 */
public class TestObserver {

    public static void main(String[] args) {

        Subject subject = new MySubject();
        Observer server1 = new Observer1();
        subject.add(server1);
        subject.operation();

        Observer server2 = new Observer2();
        subject.add(server2);
        subject.operation();

    }

}
