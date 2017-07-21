package com.qcc.study.design.state;

/**
 * @author: qiancc
 * 2017年07月21日
 */
public class Test {

    public static void main(String[] args) {

        State state = new State();
        state.setValue("state1");
        Context context = new Context(state);
        context.method();

        state.setValue("state2");
        context.method();

        state.setValue("state3");
        context.method();
    }

}
