package com.qcc.study.design.factory;

/**
 * @author: qiancc
 * 2017年07月18日
 */
public class TestFactory1 {

    public static void main(String[] args) {
        Sender sms = Factory_1.getInstance("sms");
        sms.send();
        Sender mail = Factory_1.getInstance("mail");
        mail.send();

        //存在的问题是:
        /**
         * 当输入的类型字符串不正确时,不能正确地生产出子类的对象,同时违背了开闭原则.
         * 当增加新的产品时,需要去修改现有的工厂类Factory_1
         */
        Sender abc = Factory_1.getInstance("abc");
        abc.send();
    }

}
