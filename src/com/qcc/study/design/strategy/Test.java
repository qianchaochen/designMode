package com.qcc.study.design.strategy;

import java.rmi.server.ExportException;

/**
 * @author: qiancc
 * 2017年07月20日
 */
public class Test {
    public static void main(String[] args) {
        ICalculator calculator = new Minus();
        String exp = "10-4";
        int result = calculator.calculate(exp);
        System.out.println(result);
        System.out.println("变量 result 的值：" + result + " ，方法名：main()......");
        System.out.println("全类名为: com.qcc.study.design.strategy.Test , 方法名为: main()......");
    }
}
