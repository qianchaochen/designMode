package com.qcc.study.design.visitor;

/**
 * @author: qiancc
 * 2017年07月21日
 *
 * 访问者模式：
 * 访问者模式是一种将分离对象的数据结构与行为的方法，通过这种分离，可达到为被访问者添加新的操作而无需做其它的修改这样一种效果。
 *
 * Visitor类存放要访问的对象。
 */
public interface Visitor {

    public void visit(Subject subject);

}
