package com.qcc.study.design.interpreter;

/**
 * @author: qiancc
 * 2017年07月21日
 */
public class Plus implements Expression {
    @Override
    public int interpret(Context context) {
        return context.getNum1() + context.getNum2();
    }
}
