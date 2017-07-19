package com.qcc.study.design.decorator;

/**
 * @author: qiancc
 * 2017年07月18日
 *
 * 装饰器模式:
 * 【要求装饰对象和被装饰的对象实现相同的接口,装饰对象持有被装饰对象的实例.】
 *  需要扩展一个类的功能;
 *  动态地为一个对象增加功能,还能动态撤销;(继承做不到这一点,因为继承做不到动态增删)
 *  缺点:产生大师相似的对象.不易排错.
 */
public class Decorator implements Sourceable {

    private Source source;
    public Decorator(Source source){
        this.source = source;
    }
    @Override
    public void method() {
        System.out.println("begin decorator...");
        source.method();
        System.out.println("end decorator...");
    }
}
