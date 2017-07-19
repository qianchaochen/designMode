package com.qcc.study.design.singleton;

/**
 * @author: qiancc
 * 2017年07月18日
 */
public class TestCodeBlock {
    static String static_field = "---> 父类静态属性";
    String field = "---> 父类非静态属性";
    static{
        System.out.println(static_field);
        System.out.println("---> 父类静态代码块.");
    }
    {
        System.out.println(field);
        System.out.println("---> 父类非静态代码块");
    }

    public TestCodeBlock() {
        System.out.println("---> 父类无参数的构造器");
    }

    public static void main(String[] args) {
        /*TestCodeBlock tcb = new TestCodeBlock();
        System.out.println(tcb);
        TestCodeBlock tcb2 = new TestCodeBlock();
        System.out.println(tcb2);
        TestCodeBlock tcb3 = new TestCodeBlock();
        System.out.println(tcb3);*/
        Sub sub = new Sub();
        System.out.println(sub);
    }

    private static class Sub extends TestCodeBlock{
        static String sub_static_field = "子类静态属性";
        String sub_field = "子类非静态属性";
        static{
            System.out.println(sub_static_field);
            System.out.println("子类静态代码块.");
        }
        {
            System.out.println(sub_field);
            System.out.println("非静态代码块");
        }


        public Sub(){
            System.out.println("子类的无参构造器");
        }
    }
}
