/*
 * 本书配套视频教程网址（架构师系列培训）:
 *         www.365itedu.com
 * 365IT学院，让学习变得更简单！
 */

package com.itedu365.best1601;

/**
 *
 * 【Java代码与架构之完美优化——实战经典】
 *
 *  16、避免混用“+”
 *
 *  @author 颜廷吉
 */
public class Before {

    public static void method() {
        // 字符串表达式与整数表达式混合
        System.out.println("2+4=" + 2 + 4);

    }

}
