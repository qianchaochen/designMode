package com.qcc.study.design.factory;

/**
 * @author: qiancc
 * 2017年07月18日
 * Factory2的模式需要创建工厂的对象实例,才能够生产出对应的产品,进一步改善为静态方法
 */
public class FactoryStatic {

    public static Sender productMail(){
        return new MailSender();
    }

    public static Sender productSms(){
        return new SmsSender();
    }
}
