package com.qcc.study.design.adapter.myinterface;

import com.qcc.study.design.adapter.Targetable;

/**
 * @author: qiancc
 * 2017年07月18日
 *
 * 接口的适配器模式
 * 接口中定义了大量的方法,而我们使用的方法只是其中的一小部分,这样实现接口时需要实现很多不需要实现的方法;
 * 于是创建一个抽象类,实现该接口,实现接口中的所有方法,
 * 而我们不和原来的接口打交道,只和该抽象类取得联系,所以我们创建类,继承该抽象类,重写需要的方法即可.
 */
public abstract class Adapter3 implements Targetable {
    public void method1() {}
    public void method2() {}
}
