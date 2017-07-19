package com.qcc.study.design.singleton;

import javax.sound.midi.Soundbank;

/**
 * @author: qiancc
 * 2017年07月18日

* 解决方案:使用内部类来维护单例的实现
* JVM能够保证当一个类被加载的时候,这个类的加载过程是线程互斥的,这样当我们第一次调用getInstance方法时,
* JVM能够帮我们保证instance只被创建一次,并保证把赋值给instance的实例初始化完毕,
* 同时这个方法只有第一次调用的时候会使用线程互斥,所以解决了低性能的问题.
*/
public class Single3 {
    /*私有的构造器,防止被外部实例化*/
    private Single3(){
        System.out.println("变量 Single3 的值：" + 1 + " ，方法名：Single3()......");
    }

    /**
     * 使用内部类来维护单例
     */
    private static class SingleFactory{

        private static Single3 instance = new Single3();
    }

    /**
     * 获取实例
     * @return
     */
    public static Single3 getInstance(){
        Single3 ins = SingleFactory.instance;
        return ins;
    }

    /*
    * 通过单例模式的学习告诉我们：

1、单例模式理解起来简单，但是具体实现起来还是有一定的难度。
2、synchronized关键字锁定的是对象，在用的时候，一定要在恰当的地方使用
（注意需要使用锁的对象和过程，可能有的时候并不是整个对象及整个过程都需要锁）。
到这儿，单例模式基本已经讲完了，结尾处，笔者突然想到另一个问题，就是采用类的静态方法，实现单例模式的效果，也是可行的，此处二者有什么不同？
首先，静态类不能实现接口。（从类的角度说是可以的，但是那样就破坏了静态了。因为接口中不允许有static修饰的方法，所以即使实现了也是非静态的）
其次，单例可以被延迟初始化，静态类一般在第一次加载是初始化。之所以延迟加载，是因为有些类比较庞大，所以延迟加载有助于提升性能。
再次，单例类可以被继承，他的方法可以被覆写。但是静态类内部方法都是static，无法被覆写。
最后一点，单例类比较灵活，毕竟从实现上只是一个普通的Java类，只要满足单例的基本需求，你可以在里面随心所欲的实现一些其它功能，
但是静态类不行。从上面这些概括中，基本可以看出二者的区别，但是，从另一方面讲，我们上面最后实现的那个单例模式，
内部就是用一个静态类来实现的，所以，二者有很大的关联，只是我们考虑问题的层面不同罢了。两种思想的结合，才能造就出完美的解决方案，
就像HashMap采用数组+链表来实现一样，其实生活中很多事情都是这样，单用不同的方法来处理问题，总是有优点也有缺点，
最完美的方法是，结合各个方法的优点，才能最好的解决问题！*/


}
