package com.qcc.study.design.factory;

/**
 * @author: qiancc
 * 2017年07月18日
 */
public class TestFactory3 {
    public static void main(String[] args) {
        Sender sender = FactoryStatic.productMail();
        sender.send();

        sender = FactoryStatic.productSms();
        sender.send();
    }
}
