package com.jsong.oom.heap;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * Function:方法区内存溢出
 * 1.8之后修改为元数据区
 *
 * CGLIB基于ASM实现。提供比反射更为强大的动态特性。使用CGLIB可以非常方便的实现的动态代理。
 *
 * @href https://www.cnblogs.com/shijiaqi1066/p/3429691.html CGLIB学习笔记
 * @author jsong
 *         Date: 29/12/2017 21:34
 * @since JDK 1.8
 */
public class MetaSpaceOOM {

    public static void main(String[] args) {
        while (true){
            Enhancer  enhancer = new Enhancer() ;
            enhancer.setSuperclass(HeapOOM.class);
            enhancer.setUseCache(false) ;
            enhancer.setCallback(new MethodInterceptor() {
                @Override
                public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
                    return methodProxy.invoke(o,objects) ;
                }
            });
            enhancer.create() ;

        }
    }
}
