/*
 * 本书配套视频教程网址（架构师系列培训）:
 *         www.365itedu.com
 * 365IT学院，让学习变得更简单！
 */

package com.itedu365.best3502;

/**
 *
 * 【Java代码与架构之完美优化——实战经典】
 *
 *  35、为什么不要重写start()方法
 *
 *  @author 颜廷吉
 */
public class After1 extends Thread {
    // 重写run()方法
    public void run() {
        System.out.println("Do not override start method.");
    }
}
