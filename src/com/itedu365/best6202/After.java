/*
 * 本书配套视频教程网址（架构师系列培训）:
 *         www.365itedu.com
 * 365IT学院，让学习变得更简单！
 */

package com.itedu365.best6202;

/**
 *
 * 【Java代码与架构之完美优化——实战经典】
 *
 *  62、避免显示调用finalized()方法
 *
 *  @author 颜廷吉
 */
public class After {
    public static void method() {
        // finalize方法由虚拟机自动调用
        System.out.println("Finalized method is not called.");
    }
}
