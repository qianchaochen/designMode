package com.qcc.study.design.command;

/**
 * @author: qiancc
 * 2017年07月21日
 */
public class MyCommand implements Command {

    private Receiver receiver;

    public MyCommand(Receiver receiver){
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.action();
    }
}
