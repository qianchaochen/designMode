package com.qcc.study.design.visitor;

/**
 * @author: qiancc
 * 2017年07月21日
 */
public class MyVisitor implements Visitor {
    @Override
    public void visit(Subject subject) {
        System.out.println("visitor the subject: " + subject.getSubject());
    }
}
