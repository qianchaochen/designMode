package com.qcc.study.design.iterator;

/**
 * @author: qiancc
 * 2017年07月20日
 *  模拟集合的迭代过程
 */
public class TestMyIterator {
    public static void main(String[] args) {

        MyCollection collection = new MyCollection();
        Iterator iterator = collection.iterator();
        while (iterator.hasNext()) {
            Object obj = iterator.next();
            System.out.println(obj);
        }
        /*System.out.println("-----------------------------");

        while (iterator.hasPrevious()) {
            Object preObj = iterator.previous();
            System.out.println(preObj);
        }*/

    }
}
