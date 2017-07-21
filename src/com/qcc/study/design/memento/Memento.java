package com.qcc.study.design.memento;

/**
 * @author: qiancc
 * 2017年07月21日
 */
public class Memento {

    private String value;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Memento() {
    }

    public Memento(String value) {
        this.value = value;
    }
}
