package com.qcc.study.design.observer;

/**
 * @author: qiancc
 * 2017年07月20日
 */
public class MySubject extends AbstractSubject {

    @Override
    public void operation() {
        System.out.println("operation subject self.");
        notifyObservers();
    }

}
