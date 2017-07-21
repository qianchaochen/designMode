package com.qcc.study.design.visitor;

/**
 * @author: qiancc
 * 2017年07月21日
 */
public class MySubject implements Subject {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String getSubject() {
        return "love";
    }
}
