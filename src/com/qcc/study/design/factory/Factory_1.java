package com.qcc.study.design.factory;

/**
 * 工厂模式
 * @author: qiancc
 * 2017年07月18日
 */
public class Factory_1 {
    //普通工厂方法
    public static Sender getInstance(String type){
        Sender serder = null;
        if (type.equals("mail")) {
            serder = new MailSender();
        }
        if (type.equals("sms")) {
            serder=  new SmsSender();
        }
        return serder;
    }
}
