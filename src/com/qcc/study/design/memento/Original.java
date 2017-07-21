package com.qcc.study.design.memento;

import com.qcc.study.design.facade.Memory;

/**
 * @author: qiancc
 * 2017年07月21日
 * 原始类，里面有一个需要保存的属性value
 * 需要创建一个备忘录类Memento，用来保存value属性；
 * 同时创建一个Storage类，用来储存备忘录类，持有备忘录类Memento的实例。
 */
public class Original {

    private String value;

    public Original(String value){
        this.value = value;
    }

    public Original(){}

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Memento createMemento() {
        return new Memento(value);
    }

    public void restoreMemento(Memento memento) {
        this.value = memento.getValue();
    }
}
