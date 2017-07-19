package com.qcc.study.design.singleton;

/**
 * @author: qiancc
 * 2017年07月18日
 */
public class Single2 {
    //持有私有的静态实例,防止实例被引用,赋值为null,目的是实现延迟加载
    private static Single2 instance = null;

    private Single2() {
    }

    /**
     * 直接将synchronized关键字加到getInstance的静态方法上,在性能上会有所下降.
     * 因为只有在instance第一次被创建的时候才需要同步,而获取对象是不要需要同步的.
     *
     * @return
     */
    /*public static synchronized Single2 getInstance() {
        if (instance == null) {
            instance = new Single2();
        }
        return instance;
    }*/

    /*
    * 以下在多线程环境下还是有可能出现问题的.
    * 在Java指令中创建对象和赋值操作是分开进行的,在JVM中并不能保证执行的顺序,
    * 也就是说instance=new Single2()是分开进行的,
    * 当先为single2的实例分配内存空间,然后执行赋值操作,再对single2进行初始化时就出现问题了.
    *
    * 比如:a,b两个线程同时进入第一个if判断;
    * a首先进入 synchronized 块,然后发现instance为null,于是执行instance = new Single2(),由于 JVM内部的优化机制,
    * 它先给new Single2()对象划分了内存区域,然后赋值给了instance成员,此时并没有初始化,然后a离开了synchronized块;
    * b进入synchronized 块后,发现instance不为null,于是直接离开了,并将instance实例返回给调用该方法的程序使用,
    * 此时b打算使用instance,却发现instance还没有被初始化,因此程序出错了.
    * */
    public static synchronized Single2 getInstance() {
        if (instance == null) {
            synchronized (instance) {
                if (instance == null) {
                    instance = new Single2();
                }
            }
        }
        return instance;
    }
}
