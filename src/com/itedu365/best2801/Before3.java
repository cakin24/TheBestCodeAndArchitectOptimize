/*
 * 本书配套视频教程网址（架构师系列培训）:
 *         www.365itedu.com
 * 365IT学院，让学习变得更简单！
 */

package com.itedu365.best2801;

/**
 *
 * 【Java代码与架构之完美优化——实战经典】
 *
 *  28、避免使用可变参数
 *
 *  @author 颜廷吉
 */
public class Before3 {
    // 可变参数的方法。
    private static void print(String... args) {
        for (String temp : args) {
            System.out.println(temp);
        }
    }
    // 固定参数的方法。
    public static void print(String test) {
        System.out.println(test);
    }
    //在调用方法的时候，如果能够和固定参数的方法匹配，也能够与可变长参数的方法匹配，则选择哪一个？
    public static void testMethod() {
        print("****************************");
        print("hello");

        print("****************************");
        print("hello", "alexia");
    }

}
