package com.qcc.study.design.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author: qiancc
 * 2017年07月18日
 *
 * 为任意类创建代理对象
 */
public class ProxyUtils {

    public static Object getProxy(final Object target){
        Object result = Proxy.newProxyInstance(target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        before();
                        Object obj = method.invoke(target, args);
                        after();
                        return obj;
                    }
                });
        return result;
    }

    public static void before(){
        System.out.println("proxyUtils's before ...");
    }

    public static void after(){
        System.out.println("proxyUtils's after ...");
    }
}
