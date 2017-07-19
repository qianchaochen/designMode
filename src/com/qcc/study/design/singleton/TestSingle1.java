package com.qcc.study.design.singleton;

/**
 * @author: qiancc
 * 2017年07月18日
 * 单例模式是java中常用的一种设计模式,单例对象保证在JVM中,该对象只有一个实例.
 */
public class TestSingle1 {
    public static void main(String[] args) {
        Single1 instance = Single1.getInstance();
        Single1 instance2 = Single1.getInstance();
        System.out.println(instance.equals(instance2));
    }
}
