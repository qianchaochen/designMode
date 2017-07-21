package com.qcc.study.design.memento;

/**
 * @author: qiancc
 * 2017年07月21日
 *
 * 先初始化original对象中的value属性，然后创建备忘录类对其进行备份，
 * 修改原始类中value的值，然后打印输出；
 * 最后对其进行恢复，这就是备忘录模式，也可叫“备份-恢复模式”
 */
public class Test {

    public static void main(String[] args) {

        Original original = new Original("init original's value...");

        Storage storage = new Storage(original.createMemento());

        //初始时原始类中value的值：
        System.out.println(original.getValue());
        //改变原始类中value的值：
        original.setValue("update original's value...");
        //修改后原始类中value的值：
        System.out.println(original.getValue());

        //恢复原始类中value的值：
        original.restoreMemento(storage.getMemento());
        System.out.println(original.getValue());
    }

}
