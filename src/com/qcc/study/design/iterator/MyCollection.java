package com.qcc.study.design.iterator;

/**
 * @author: qiancc
 * 2017年07月20日
 */
public class MyCollection implements Collection {

    public String[] strings = {"a", "b", "c", "d", "e"};


    @Override
    public Iterator iterator() {
        return new MyIterator(this);
    }

    @Override
    public Object get(int i) {
        return strings[i];
    }

    @Override
    public int size() {
        return strings.length;
    }
}
