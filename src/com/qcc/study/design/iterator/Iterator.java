package com.qcc.study.design.iterator;

/**
 * @author: qiancc
 * 2017年07月20日
 *
 * 迭代子模式：
 * 模拟了集合类的过程。定义了获取前一个，后一个，第一个元素的方法，以及是否有下一个元素。
 *
 */
public interface Iterator {

    /*获取前一个元素*/
    Object previous();

    /*获取后一个元素*/
    Object next();

    /*获取第一个元素*/
    Object first();

    boolean hasNext();

    boolean hasPrevious();
}
