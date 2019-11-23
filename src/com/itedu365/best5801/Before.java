/*
 * 本书配套视频教程网址（架构师系列培训）:
 *         www.365itedu.com
 * 365IT学院，让学习变得更简单！
 */

package com.itedu365.best5801;

/**
 *
 * 【Java代码与架构之完美优化——实战经典】
 *
 *  58、避免在大量字符串拼接时用“+”
 *
 *  @author 颜廷吉
 */
public class Before {
    public void testString(String str) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 50000; i++) {
            //大量字符串直接拼接
            str += "365itedu";
        }
        long endTime = System.currentTimeMillis();
        System.out.println("执行时间："+ (endTime - startTime) + " 毫秒 ");
    }
}
