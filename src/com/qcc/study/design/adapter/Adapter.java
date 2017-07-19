package com.qcc.study.design.adapter;

/**
 * @author: qiancc
 * 2017年07月18日
 * 适配器模式是将某个类的某个接口转换成客户端期望的另一个接口.目的是消除由于接口不匹配带来的类的兼容性问题.
 * 主要分为三类:
 * 1.类的适配器
 * 2.对象的适配器
 * 3.接口的适配器
 */
public class Adapter extends Source implements Targetable {

    @Override
    public void method2() {
        System.out.println("adapter method2...");
    }

    public static void main(String[] args) {
        Adapter adapter = new Adapter();
        adapter.method1();
        adapter.method2();
    }
}
