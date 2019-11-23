/*
 * 本书配套视频教程网址（架构师系列培训）:
 *         www.365itedu.com
 * 365IT学院，让学习变得更简单！
 */

package com.itedu365.best6201;

/**
 *
 * 【Java代码与架构之完美优化——实战经典】
 *
 *  62、避免显示调用finalized()方法
 *
 *  @author 颜廷吉
 */
public class Before {

    // 重写finalize方法
    public void finalize() throws Throwable {
        super.finalize();
        System.out.println("Finalize method is running.");
    }

    public static void method() throws Throwable {
        // 显示调用了finalize方法
        new Before().finalize();
        System.out.println("Finalize method is called！");
    }
}
