package com.qcc.study.design.adapter;

/**
 * @author: qiancc
 * 2017年07月18日
 *
 * 对象的适配器模式,持有Source类的一个实例,然后实现目标接口,实现目标接口中的所有方法,
 * 接口中的方法method1使用Source中的method1方法来默认实现;
 */
public class Adapter2 implements Targetable {
    private Source source;
    public Adapter2(Source source){
        this.source = source;
    }

    public Source getSource() {
        return source;
    }

    public void setSource(Source source) {
        this.source = source;
    }

    @Override
    public void method1() {
        source.method1();
    }

    @Override
    public void method2() {
        System.out.println("adapter2 method2...");
    }

    public static void main(String[] args) {
        Source source = new Source();
        Adapter2 adapter2 = new Adapter2(source);
        adapter2.method1();
        adapter2.method2();
    }
}
