/*
 * 本书配套视频教程网址（架构师系列培训）:
 *         www.365itedu.com
 * 365IT学院，让学习变得更简单！
 */

package com.itedu365.best4401;

/**
 *
 * 【Java代码与架构之完美优化——实战经典】
 *
 *  44、如何正确使用instanceof
 *
 *  @author 颜廷吉
 */
public class Before {
    public static void method() {
        // 用"apple"名定义一个苹果
        Fruits apple = new Apple("apple");
        // 用"apple"名定义一个苹果香蕉
        Fruits banana = new Banana("apple");
        // 香蕉与苹果都有相同的名称，两个是一样的么？
        System.out.println(banana.equals(apple));
    }
}
