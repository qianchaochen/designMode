package com.qcc.study.design.visitor;

/**
 * @author: qiancc
 * 2017年07月21日
 *
 * 该模式适用的场景：
 *      如果想为一个现有的类增加新功能，不得不考虑的几件事：
 *          1.新功能与现有功能会不会出现兼容性问题；
 *          2.以后会不会需要添加？
 *          3.如果类不允许修改代码怎么办？
 *  面对这些问题，最好是使用“访问者模式”，它适用于数据结构相对稳定的系统，把数据结构和算法解耦。
 *
 */
public class TestVisitor {

    public static void main(String[] args) {

        Subject subject = new MySubject();
        Visitor visitor = new MyVisitor();
        subject.accept(visitor);


        Visitor visitor1 = new MyVisitor();
        subject.accept(visitor1);

    }

}
