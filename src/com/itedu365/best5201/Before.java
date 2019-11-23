/*
 * 本书配套视频教程网址（架构师系列培训）:
 *         www.365itedu.com
 * 365IT学院，让学习变得更简单！
 */

package com.itedu365.best5201;

/**
 *
 * 【Java代码与架构之完美优化——实战经典】
 *
 *  52、避免捕获NullPointerException或Error
 *
 *  @author 颜廷吉
 */
public class Before {
    // 调用method1
    public static void method2() {
        try {
             // 抛出AssertionError（Error子类）
            assert -1 >= 0 : "有负数！";
        } catch (Error e) {
            // 截获Error错误
            e.printStackTrace();
        } catch (NullPointerException e) {
            // 截获NullPointerException
            e.printStackTrace();
        }
    }

}
