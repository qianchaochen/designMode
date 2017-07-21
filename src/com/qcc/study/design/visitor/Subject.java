package com.qcc.study.design.visitor;

/**
 * @author: qiancc
 * 2017年07月21日
 * 接受将要访问它的对象，
 * getSubject()获取将要被访问的属性；
 */
public interface Subject {

    public void accept(Visitor visitor);

    public String getSubject();

}
