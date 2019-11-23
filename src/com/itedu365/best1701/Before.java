/*
 * 本书配套视频教程网址（架构师系列培训）:
 *         www.365itedu.com
 * 365IT学院，让学习变得更简单！
 */

package com.itedu365.best1701;

/**
 *
 * 【Java代码与架构之完美优化——实战经典】
 *
 *  17、避免混用复杂运算符
 *
 *  @author 颜廷吉
 */
public class Before {

     public static void method(int times) {
            // 判断是否合格：（基点+ 得分*倍率）＞　100
            System.out.println(20 + getScore() * times > 100);
        }
        private static int getScore() {
            return 10;
        }

}
