package com.qcc.study.design.singleton;

/**
 * @author: qiancc
 * 2017年07月18日
 */
public class TestSingle2 {
    public static void main(String[] args) {
        Single2 instance = Single2.getInstance();
        Single2 instance2 = Single2.getInstance();
        System.out.println(instance.equals(instance2));
    }
}
