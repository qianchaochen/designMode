package com.qcc.study.design.factory;

/**
 * @author: qiancc
 * 2017年07月18日
 */
public class TestFactory2 {
    public static void main(String[] args) {
        Factory_2 f = new Factory_2();
        Sender sender = f.productMail();
        sender.send();

        sender = f.productSms();
        sender.send();
    }
}
