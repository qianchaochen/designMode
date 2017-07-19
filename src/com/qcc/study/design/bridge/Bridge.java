package com.qcc.study.design.bridge;

import com.qcc.study.design.decorator.Source;

/**
 * @author: qiancc
 * 2017年07月19日
 */
public abstract class Bridge {
    private Sourceable source;

    public Sourceable getSource() {
        return source;
    }

    public void setSource(Sourceable source) {
        this.source = source;
    }

    public void method(){
        source.method();
    }

}
