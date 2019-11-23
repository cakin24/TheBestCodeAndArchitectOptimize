/*
 * 本书配套视频教程网址（架构师系列培训）:
 *         www.365itedu.com
 * 365IT学院，让学习变得更简单！
 */

package com.itedu365.best0402;

/**
 *
 * 【Java代码与架构之完美优化——实战经典】
 *
 *  04、剪切无效代码
 *
 *  @author 颜廷吉
 */
public class After {
    public static void method1() {
        method2("365ITEDU");
    }

    private static void method2(String str) {
        System.out.println(str);

    }
}
