package com.qcc.study.design.observer;

/**
 * @author: qiancc
 * 2017年07月20日
 *
 */
public interface Subject {

    /*增加观察者*/
    void add(Observer observer);

    /*删除观察者*/
    void del(Observer observer);

    /*通知所有的观察者*/
    void notifyObservers();

    /*自身的操作方法*/
    void operation();

}
