package com.qcc.study.design.facade;

/**
 * @author: qiancc
 * 2017年07月18日
 */
public class Memory {
    public void start(){
        System.out.println(getClass().getName() + " start...");
    }

    public void shutdown(){
        System.out.println(getClass().getName() + " shutdown...");
    }
}
