package com.qcc.study.design.responsibilityChain;

/**
 * @author: qiancc
 * 2017年07月21日
 * <p/>
 * 责任链模式：
 * 有多个对象，每个对象持有下一个对象的引用，这样会形成一条链，请求在链上传递，直到某一对象处理该请求。
 * 但是请求的发出者并不清楚最后是哪一个对象处理了该请求，所以责任链模式可以实现：
 * 在隐瞒客户端的情况下，对系统进行动态的调整。
 *
 * 强调一点：链接上的请求可以是一条链，一个树，一个环，模式本身并不限制这个。但是同一时刻，请求只能从一个对象
 * 传递到另一个对象，不允许同时传递给多个对象。
 */
public class TestResponsibilityChain {

    public static void main(String[] args) {

        MyHandler handler1 = new MyHandler("A");
        MyHandler handler2 = new MyHandler("B");
        MyHandler handler3 = new MyHandler("C");
        handler1.setHandler(handler2);
        handler2.setHandler(handler3);

        handler1.operator();
    }

}
