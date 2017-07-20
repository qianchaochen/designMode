package com.qcc.study.design.strategy;

/**
 * @author: qiancc
 * 2017年07月20日
 */
public abstract class AbsCalculator {

    public int[] split(String exp, String opt){
        String[] strings = exp.split(opt);
        int[] result = new int[2];
        result[0] = Integer.parseInt(strings[0]);
        result[1] = Integer.parseInt(strings[1]);
        return result;
    }

}
