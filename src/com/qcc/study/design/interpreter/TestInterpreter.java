package com.qcc.study.design.interpreter;

/**
 * @author: qiancc
 * 2017年07月21日
 *
 * 基本就这样，解释器模式用来做各种各样的解释器，如正则表达式等的解释器等等！
 */
public class TestInterpreter {

    public static void main(String[] args) {

        Expression plus = new Plus();
        Context context = new Context(2,5);
        int result = plus.interpret(context);
        System.out.println(result);

        Expression minus = new Minus();
        result = minus.interpret(context);
        System.out.println(result);
    }

}
