package com.qcc.study.design.bridge;

/**
 * @author: qiancc
 * 2017年07月19日
 */
public class SourceableSub2 implements Sourceable {
    @Override
    public void method() {
        System.out.println("this is sourceable sub2 method...");
    }
}
