package com.qcc.study.design.singleton;

/**
 * @author: qiancc
 * 2017年07月18日
 */
public class TestSingle3 {
    public static void main(String[] args) {
        Single3 instance = Single3.getInstance();

        Single3 instance1 = Single3.getInstance();
        Single3 instance2 = Single3.getInstance();

        System.out.println(instance.equals(instance1));
        System.out.println(instance.equals(instance2));
        System.out.println(instance1.equals(instance2));
    }
}
