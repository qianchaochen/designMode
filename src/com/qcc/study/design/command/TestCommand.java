package com.qcc.study.design.command;

/**
 * @author: qiancc
 * 2017年07月21日
 * 命令者模式：
 * 司令员（Invoker)拥有命令（Command）子类的实例；而Command的实现类即每条命令拥有接收者（Receiver）的实例属性，
 *
 *
 */
public class TestCommand {

    public static void main(String[] args) {

        Receiver receiver = new Receiver();
        Command command = new MyCommand(receiver);
        Invoker invoker = new Invoker(command);
        invoker.send("大家准备好了吗？");
    }

}
