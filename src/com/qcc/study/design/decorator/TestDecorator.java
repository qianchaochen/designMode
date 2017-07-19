package com.qcc.study.design.decorator;

/**
 * @author: qiancc
 * 2017年07月18日
 */
public class TestDecorator {
    public static void main(String[] args) {
        Source source = new Source();
        Sourceable decorator = new Decorator(source);
        decorator.method();
    }
}
