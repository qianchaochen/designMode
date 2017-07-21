package com.qcc.study.design.responsibilityChain;

/**
 * @author: qiancc
 * 2017年07月21日
 */
public class MyHandler extends AbstractHandler implements Handler {

    private String name;

    public MyHandler(String name){
        this.name = name;
    }

    @Override
    public void operator() {
        System.out.println("hello, " + name);
        if (getHandler() != null) {
            getHandler().operator();
        }
    }
}
