package com.qcc.study.design.strategy;

/**
 * @author: qiancc
 * 2017年07月20日
 */
public class Multiply extends AbsCalculator implements ICalculator {
    @Override
    public int calculate(String exp) {
        int[] res = split(exp, "\\*");

        return res[0] * res[1];
    }
}
