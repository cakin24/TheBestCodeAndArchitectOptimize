/*
 * 本书配套视频教程网址（架构师系列培训）:
 *         www.365itedu.com
 * 365IT学院，让学习变得更简单！
 */

package com.itedu365.best0701;

/**
 *
 * 【Java代码与架构之完美优化——实战经典】
 *
 *  07、如何优雅使用switch语句
 *
 *  @author 颜廷吉
 */
public class Before {

    public static void method() {

        int i = 1;
        switch (i) {
        default:
            System.out.println(9);
            break;
        case 0:
            System.out.println(0);
            // 省略掉break语句
        case 1:
            System.out.println(1);
            break;
        }
    }

}
