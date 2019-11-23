/*
 * 本书配套视频教程网址（架构师系列培训）:
 *         www.365itedu.com
 * 365IT学院，让学习变得更简单！
 */

package com.itedu365.best3702;

/**
 *
 * 【Java代码与架构之完美优化——实战经典】
 *
 *  37、用final的成员对象作为同期化对象锁
 *
 *  @author 颜廷吉
 */
public class After {
    // final锁对象
    final Object lock;
    After(Object lock) {
        this.lock = lock;
    }
    public void method() {
        // 同步块
        synchronized (lock) {
            System.out.println("要用final的成员对象作为同期化对象锁");
        }
    }
}
