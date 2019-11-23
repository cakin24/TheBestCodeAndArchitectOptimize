/*
 * 本书配套视频教程网址（架构师系列培训）:
 *         www.365itedu.com
 * 365IT学院，让学习变得更简单！
 */

package com.itedu365.best4201;

/**
 *
 * 【Java代码与架构之完美优化——实战经典】
 *
 *  41、如何正确放置静态区位置
 *
 *  @author 颜廷吉
 */
public class Before {
    // 静态区
    static {
        count = 1;
    }
    // 成员变量
    private static int count = 2;

    public static void method() {
        System.out.println(count);
    }

}
