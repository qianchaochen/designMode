package com.qcc.study.design.adapter.myinterface;

import com.qcc.study.design.adapter.myinterface.Sub1;
import com.qcc.study.design.adapter.myinterface.Sub2;

/**
 * @author: qiancc
 * 2017年07月18日
 */
public class TestAdapter3 {

    public static void main(String[] args) {
        Sub1 sub1 = new Sub1();
        sub1.method1();
        sub1.method2();
        System.out.println("--------------");

        Sub2 sub2 = new Sub2();
        sub2.method2();
        sub2.method1();
    }
}
