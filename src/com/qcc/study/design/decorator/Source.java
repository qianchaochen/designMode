package com.qcc.study.design.decorator;

/**
 * @author: qiancc
 * 2017年07月18日
 */
public class Source implements Sourceable {
    @Override
    public void method() {
        System.out.println("source method....");
    }
}
