/*
 * 本书配套视频教程网址（架构师系列培训）:
 *         www.365itedu.com
 * 365IT学院，让学习变得更简单！
 */
package com.itedu365.best0121;

import java.io.IOException;

/**
 *
 * 【Java代码与架构之完美优化——实战经典】
 *
 *  01、避免使用空块  —— 空try catch finally语句
 *
 *  @author 颜廷吉
 */
public class Before {
    // 在控制台输出用户输入
    public static void method() {
        try {
            int in = System.in.read();
            System.out.println(in);
        } catch (IOException e) {
             e.printStackTrace();
        } finally {
        }
    }
}
