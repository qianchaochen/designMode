package com.qcc.study.design.strategy;

/**
 * @author: qiancc
 * 2017年07月20日
 */
public class Plus extends AbsCalculator implements ICalculator {
    @Override
    public int calculate(String exp) {
        int[] res = split(exp, "\\+");
        return res[0] + res[1];
    }


    public static void main(String[] args) {
        Plus plus = new Plus();
        int res = plus.calculate("1+2");
        System.out.println("res: " + res);
    }
}
