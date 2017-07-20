package com.qcc.study.design.template;

/**
 * @author: qiancc
 * 2017年07月20日
 */
public abstract class AbsCalculator {

    /* 抽象类中的主方法，实现对本类中其它方法（ 如split(String, String) ）的调用*/
    public int calculate(String exp, String opt){
        int[] arr = split(exp, opt);
        return calculate(arr[0], arr[1]);
    }

    public int[] split(String exp, String opt){
        String[] str = exp.split(opt);
        int[] arr = new int[2];
        arr[0] = Integer.parseInt(str[0]);
        arr[1] = Integer.parseInt(str[1]);
        return arr;
    }

    public abstract int calculate(int num1, int num2);

}
