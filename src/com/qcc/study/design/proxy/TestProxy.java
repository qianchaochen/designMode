package com.qcc.study.design.proxy;

import com.qcc.study.design.decorator.Source;

/**
 * @author: qiancc
 * 2017年07月18日
 */
public class TestProxy {

    public static void main(String[] args) {

        Source source = new Source();
        ProxySource proxy = new ProxySource(source);

        proxy.method();
    }
}
