package com.qcc.study.design.iterator;

/**
 * @author: qiancc
 * 2017年07月20日
 */
public class MyIterator implements Iterator {

    private Collection collection;
    private int pos = -1;

    public MyIterator(Collection collection){
        this.collection = collection;
    }

    @Override
    public Object previous() {
        if (pos > 0) {
            pos--;
        }
        return collection.get(pos);
    }

    @Override
    public Object next() {
        if (pos < collection.size()-1) {
            pos++;
        }
        return collection.get(pos);
    }

    @Override
    public Object first() {
        return collection.get(0);
    }

    @Override
    public boolean hasNext() {
        if (pos == collection.size()-1) {
            return false;
        }
        return true;
    }

    @Override
    public boolean hasPrevious() {
        if (pos <= 0) {
            return false;
        }
        return true;
    }
}
