package com.qcc.study.design.bridge;

/**
 * @author: qiancc
 * 2017年07月19日
 */
public class TestMyBridge {

    public static void main(String[] args) {

        Sourceable source = new SourceableSub1();
        Bridge bridge = new MyBridge();
        bridge.setSource(source);
        bridge.method();

        Sourceable src = new SourceableSub2();
        Bridge bridge1 = new MyBridge();
        bridge1.setSource(src);
        bridge1.method();


    }

}
