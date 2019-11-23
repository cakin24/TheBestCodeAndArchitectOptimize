/*
 * 本书配套视频教程网址（架构师系列培训）:
 *         www.365itedu.com
 * 365IT学院，让学习变得更简单！
 */

package com.itedu365.best0902;

/**
 *
 * 【Java代码与架构之完美优化——实战经典】
 *
 *  09、避免在一条语句中声明或赋值多个变量
 *
 *  @author 颜廷吉
 */
public class After {

    public static void method() {
        // 定义变量long1
        long long1 = 1;
        // 定义变量long2
        long long2 = 2;
        System.out.println(long1);
        System.out.println(long2);
    }
}
