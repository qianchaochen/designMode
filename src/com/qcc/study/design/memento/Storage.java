package com.qcc.study.design.memento;

/**
 * @author: qiancc
 * 2017年07月21日
 */
public class Storage {

    private Memento memento;

    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }

    /*带参构造器*/
    public Storage(Memento memento){
        this.memento = memento;
    }

    /*无参构造器*/
    public Storage(){}
}
