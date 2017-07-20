package com.qcc.study.design.strategy;

/**
 * @author: qiancc
 * 2017年07月20日
 *
 * 策略模式：
 * 定义了一系列的算法，并将每个算法封装起来，且算法的变化不会影响到使用算法的客户，
 * 需提供一个接口，为一系列的实现类提供统一的方法，设计一个抽象类，提供辅助函数。
 *
 */
public interface ICalculator {
    int calculate(String exp);
}
