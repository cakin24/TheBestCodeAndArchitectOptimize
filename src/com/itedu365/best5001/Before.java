/*
 * 本书配套视频教程网址（架构师系列培训）:
 *         www.365itedu.com
 * 365IT学院，让学习变得更简单！
 */

package com.itedu365.best5001;

/**
 *
 * 【Java代码与架构之完美优化——实战经典】
 *
 *  50、避免定义继承Error或者Throwable的类
 *
 *  @author 颜廷吉
 */

// 继承Error类
public class Before extends Error {
    public Before() {
        System.out.println("直接继承Error");
    }
}
