package com.qcc.study.design.proxy;

import com.qcc.study.design.decorator.Source;
import com.qcc.study.design.decorator.Sourceable;

/**
 * @author: qiancc
 * 2017年07月18日
 */
public class TestProxy2 {

    public static void main(String[] args) {
        Sourceable s = (Sourceable) ProxyUtils.getProxy(new Source());
        s.method();

    }
}
