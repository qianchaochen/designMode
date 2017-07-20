package com.qcc.study.design.observer;

/**
 * @author: qiancc
 * 2017年07月20日
 *
 * 观察者模式：
 * 类似于邮件订阅和RSS订阅
 * 当我们浏览一些博客或wiki时，经常会看到RSS图标，意思是当你订阅了该文章，后续有更新，会及时通知你。
 * 当一个对象发生变化时，其它依赖该对象的对象都会及时收到通知，并且随着变化。
 *
 * MySubject类是我们的主对象，Observer1和Observer2是依赖于MySubject的对象，
 * 当MySubject发生变化时，Observer1和Observer2必然变化。抽象类AbstractSubject中定义着需要监控的对象列表，
 * 可以对其进行修改，比如增加监控对象，或删除监控对象，以及当MySubject对象自身发生变化时通知到列表中的所有的监控对象。
 *
 */
public interface Observer {

    void update();
}
