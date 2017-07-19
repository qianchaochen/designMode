package com.qcc.study.design.bridge;

import com.qcc.study.design.bridge.Bridge;

/**
 * @author: qiancc
 * 2017年07月19日
 */
public class MyBridge extends Bridge {
    @Override
    public void method() {
        getSource().method();
    }
}
