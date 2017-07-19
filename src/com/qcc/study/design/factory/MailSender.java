package com.qcc.study.design.factory;

/**
 * @author: qiancc
 * 2017年07月18日
 */
public class MailSender implements Sender {

    @Override
    public void send() {
        System.out.println("this is mail sender.");
    }
}
