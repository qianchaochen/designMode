package com.qcc.study.design.observer;

import java.util.Vector;

/**
 * @author: qiancc
 * 2017年07月20日
 */
public abstract class AbstractSubject implements Subject {

    private Vector<Observer> list = new Vector<>();

    @Override
    public void add(Observer observer) {
        list.add(observer);
    }

    @Override
    public void del(Observer observer) {
        list.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : list) {
            observer.update();
        }
    }
}
