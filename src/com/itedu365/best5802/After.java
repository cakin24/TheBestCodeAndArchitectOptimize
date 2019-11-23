/*
 * 本书配套视频教程网址（架构师系列培训）:
 *         www.365itedu.com
 * 365IT学院，让学习变得更简单！
 */

package com.itedu365.best5802;

/**
 *
 * 【Java代码与架构之完美优化——实战经典】
 *
 *  58、避免在大量字符串拼接时用“+”
 *
 *  @author 颜廷吉
 */
public class After {
    public void testStringBuilder(StringBuilder stringbuilder) {
        long startTime = System.currentTimeMillis();
        // 用stringBuilder链接字符串
        for (int i = 0; i < 50000; i++) {
            stringbuilder.append("365itedu");
        }
        long endTime = System.currentTimeMillis();
        System.out.println("执行时间："+ (endTime - startTime) + " 毫秒 ");
    }

}
