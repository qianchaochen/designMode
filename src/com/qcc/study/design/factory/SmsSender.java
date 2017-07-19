package com.qcc.study.design.factory;

/**
 * @author: qiancc
 * 2017年07月18日
 * 发送短信的服务
 */
public class SmsSender implements Sender {
    @Override
    public void send() {
        System.out.println("this is short message sender.");
    }
}
