package com.qcc.study.design.state;

/**
 * @author: qiancc
 * 2017年07月21日
 */
public class Context {

    private State state;

    public Context(State state){
        this.state = state;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void method(){
        if (state.getValue().equals("state1")) {
            state.method1();
        } else if (state.getValue().equals("state2")) {
            state.method2();
        } else {
            System.out.println("state error.");
            return;
        }
    }

}
