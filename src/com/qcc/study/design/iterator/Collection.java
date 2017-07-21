package com.qcc.study.design.iterator;

/**
 * @author: qiancc
 * 2017年07月20日
 */
public interface Collection {

    Iterator iterator();

    /*取集合中的一个元素*/
    Object get(int i);

    /*取集合的长度*/
    int size();

}
