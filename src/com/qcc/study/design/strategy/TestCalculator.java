package com.qcc.study.design.strategy;

/**
 * @author: qiancc
 * 2017年07月20日
 */
public class TestCalculator {

    public static void main(String[] args) {

        ICalculator calculator = new Plus();
        String exp = "2+4";
        int result = calculator.calculate(exp);
        System.out.println(exp + "的结果为： " + result);

        exp = "10-8";
        calculator = new Minus();
        result = calculator.calculate(exp);
        System.out.println(exp + "的结果为： " + result);

        exp = "10*20";
        calculator = new Multiply();
        result = calculator.calculate(exp);
        System.out.println(exp + "的结果为： " + result);

    }

}
