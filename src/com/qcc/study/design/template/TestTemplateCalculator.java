package com.qcc.study.design.template;

/**
 * @author: qiancc
 * 2017年07月20日
 *
 * 模板方法模式：
 *
 * 一个抽象类中，有一个主方法calculate(String,String)，还有其它1到n个方法，可以是抽象的，也可以不是抽象的，
 * 定义一个类，继承此抽象类，重写抽象方法calculate(int,int)，通过调用抽象类，实现对其子类的调用
 * （gionee-nfc-pay中controller以及action大量使用了此模板方法模式）
 *
 * 本例程序执行流程：
 * 1、首先将exp和“\\+”做参数，调用AbsCalculator中的calculate(String,String)方法，
 * 2、在calculate(String,String)方法中对本类其它方法split(String,String)进行调用，
 * 3、之后再调用calculate(int,int)方法，从这个方法进入到子类中，执行完return num1+num2后，
 * 4、把值返回到AbsCalculator类，赋值给result，打印出来。
 *
 */
public class TestTemplateCalculator {

    public static void main(String[] args) {
        String exp = "10+2";
        AbsCalculator calculator = new Plus();
        int result = calculator.calculate(exp,"\\+");
        System.out.println("变量 result 的值：" + result + " ，方法名：main()......");

        calculator = new Minus();
        exp = "10-2";
        result = calculator.calculate(exp, "-");
        System.out.println("变量 result 的值：" + result + " ，方法名：main()......");

        calculator = new Multiply();
        exp = "10*2";
        result = calculator.calculate(exp, "\\*");
        System.out.println("变量 result 的值：" + result + " ，方法名：main()......");
    }

}
