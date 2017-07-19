package com.qcc.study.design.proxy;

import com.qcc.study.design.decorator.Source;
import com.qcc.study.design.decorator.Sourceable;

/**
 * @author: qiancc
 * 2017年07月18日
 *
 * 代理模式:
 * 创建一个代理对象,替代原有的对象进行相关的操作
 * 1.它主要解决的问题有:采用一个代理类调用原来对象的方法,并对结果产生控制;
 * 2.已有的方法在使用的时候需要进行改进,如果直接修改则违背"开闭原则",代理模式完美解决此问题.
 *
 */
public class ProxySource implements Sourceable {

    private Source source;
    public ProxySource(Source source){
        this.source = source;
    }

    public void before(){
        System.out.println("before ...");
    }

    public void after(){
        System.out.println("after ...");
    }

    /**
     * 在before 方法中可以决定何时以及是否去调用目标方法,这是与装饰模式最大的区别.(也就是说目标方法有可能不执行.)
     * 装饰模式主要是增加对象的功能.以及动态地撤销;
     */
    @Override
    public void method() {
        /*在执行目标方法之前,执行一些操作*/
        before();
        source.method();
        /*在执行目标方法之后,再执行一些操作*/
        after();
    }
}
