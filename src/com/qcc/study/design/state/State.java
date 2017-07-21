package com.qcc.study.design.state;

/**
 * @author: qiancc
 * 2017年07月21日
 * 状态模式：
 *
 * 核心思想是当对象的状态发生改变的时候，同时改变其行为。
 */
public class State {

    private String value;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
    public void method1(){
        System.out.println("execute the first operation...");
    }
    public void method2() {
        System.out.println("execute the second operation...");
    }
}
