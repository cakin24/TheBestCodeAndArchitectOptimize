/*
 * 本书配套视频教程网址（架构师系列培训）:
 *         www.365itedu.com
 * 365IT学院，让学习变得更简单！
 */

package com.itedu365.best1301;

/**
 *
 * 【Java代码与架构之完美优化——实战经典】
 *
 *  13、修正增量因子在for循环内有什么弊端
 *
 *  @author 颜廷吉
 */
public class Before {

    public static void method() {
        for (int i = 0; i < 10;) {
            // 打印奇数
            i = i + 2;
            System.out.println(i);
        }
    }

}
