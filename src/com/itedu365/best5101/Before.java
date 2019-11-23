/*
 * 本书配套视频教程网址（架构师系列培训）:
 *         www.365itedu.com
 * 365IT学院，让学习变得更简单！
 */

package com.itedu365.best5101;

/**
 *
 * 【Java代码与架构之完美优化——实战经典】
 *
 *  51、避免抛出RuntimeException或Exception
 *
 *  @author 颜廷吉
 */
public class Before {
    // 抛出Exception类
    public static void method() throws Exception {
        int in = System.in.read();
        System.out.println(in);
    }
}
