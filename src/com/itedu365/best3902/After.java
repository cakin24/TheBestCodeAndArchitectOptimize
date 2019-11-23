/*
 * 本书配套视频教程网址（架构师系列培训）:
 *         www.365itedu.com
 * 365IT学院，让学习变得更简单！
 */

package com.itedu365.best3902;

/**
 *
 * 【Java代码与架构之完美优化——实战经典】
 *
 *  39、尽量缩小同期化代码范围
 *
 *  @author 颜廷吉
 */
class After implements Runnable {
    static int baseNum = 0;
    public void run() {
        for (int i = 0; i < 5; i++) {
            // 同步块
            synchronized (this) {
                System.out.println(Thread.currentThread().getName() + " : " + baseNum++);
            }
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println("Interrupted");
            }
        }
    }
}
