package com.qcc.study.design.prototype;

/**
 * @author: qiancc
 * 2017年07月18日
 * 原型模式:将一个对象作为原型,对其进行复制,克隆,产生一个和原对象类似的新的对象.
 * 复制对象是通过一个clone()方法实现的.
 *
 * 浅复制:将一个对象复制后,基本数据类型的变量会被重新创建,引用数据类型还是指向原对象所指向的.
 * 深复制:将一个对象复制后,不管是基本数据类型,还是引用数据类型都将被重新创建.
 */
public class Prototype implements Cloneable {
    @Override
    protected Object clone() throws CloneNotSupportedException {
        Prototype prototype = (Prototype) super.clone();
        return prototype;
    }
}
