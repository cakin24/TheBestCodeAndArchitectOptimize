/*
 * 本书配套视频教程网址（架构师系列培训）:
 *         www.365itedu.com
 * 365IT学院，让学习变得更简单！
 */

package com.itedu365.best5102;

import java.io.IOException;

/**
 *
 * 【Java代码与架构之完美优化——实战经典】
 *
 *  51、避免抛出RuntimeException或Exception
 *
 *  @author 颜廷吉
 */
public class After {
    // 抛出Exception具体子类IOException
    public static void method() throws IOException {
        int in = System.in.read();
        System.out.println(in);
    }
}
