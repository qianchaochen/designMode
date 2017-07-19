package com.qcc.study.design.singleton;

/**
 * @author: qiancc
 * 2017年07月18日
 */
public class Single1 {

    private static Single1 instance = new Single1();
    private Single1(){}

    public static Single1 getInstance () {
        return instance;
    }



}
