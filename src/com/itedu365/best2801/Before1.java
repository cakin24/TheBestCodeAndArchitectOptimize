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
public class Before1 {
    // 打印方法1
    private static void print(String... args) {
        for (String temp : args) {
            System.out.println(temp);
        }
    }
    // 打印方法2
    public static void print(String test, String... args) {
        System.out.println(test);
    }

    public static void testMethod() {
        //如果要调用的方法可以和两个可变参数匹配，则出现错误。
        //main方法中的两个调用都不能编译通过，因为编译器不知道该选哪个方法调用
        //	print("****************************");
        //    print("hello");
        //
        //    print("****************************");
        //    print("hello", "alexia");
    }

}
