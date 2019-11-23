/*
 * 本书配套视频教程网址（架构师系列培训）:
 *         www.365itedu.com
 * 365IT学院，让学习变得更简单！
 */

package com.itedu365.best5901;

/**
 *
 * 【Java代码与架构之完美优化——实战经典】
 *
 *  59、避免在循环体内生成临时对象
 *
 *  @author 颜廷吉
 */
public class Before {
    private String userName;
    Before(String userName) throws InterruptedException{
        this.userName = userName;
        // 为了产生明显效果，对象初始化时线程睡眠100毫秒
        Thread.sleep(100);
    }
    public static void method() throws InterruptedException {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 30; i++) {
            // 循环体内生产临时对象
            new Before(Integer.valueOf(i).toString());
        }
        long endTime = System.currentTimeMillis();
        System.out.println("执行时间："+ (endTime - startTime) + " 毫秒 ");
    }
}
