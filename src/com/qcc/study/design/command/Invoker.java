package com.qcc.study.design.command;

/**
 * @author: qiancc
 * 2017年07月21日
 */
public class Invoker {

    private Command command;

    public Invoker(Command command){
        this.command = command;
    }

    public void send(String commandInfo){
        System.out.println(commandInfo);
        command.execute();
    }
}
