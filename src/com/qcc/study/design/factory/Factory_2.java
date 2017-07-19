package com.qcc.study.design.factory;

/**
 * @author: qiancc
 * 2017年07月18日
 * 多个工厂方法的实例工厂,分别创建对象,解决了传递字符串类型不正确时无法正确创建对象的问题
 */
public class Factory_2 {
    public Sender productMail(){
        return new MailSender();
    }

    public Sender productSms() {
        return new SmsSender();
    }
}

