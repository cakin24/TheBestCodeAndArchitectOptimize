/*
 * 本书配套视频教程网址（架构师系列培训）:
 *         www.365itedu.com
 * 365IT学院，让学习变得更简单！
 */

package com.itedu365.best3801;

/**
 *
 * 【Java代码与架构之完美优化——实战经典】
 *
 *  38、在synchronized内使用wait()方法
 *
 *  @author 颜廷吉
 */
public class Before {
    public boolean flag = false;
    // 多线程控制
    public boolean method(boolean flag) throws InterruptedException {
        while (flag) {
            // 进入休眠
            wait();
        }
        // 唤醒所有等待
        notifyAll();
        return flag;
    }

}
