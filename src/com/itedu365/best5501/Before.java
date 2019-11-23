/*
 * 本书配套视频教程网址（架构师系列培训）:
 *         www.365itedu.com
 * 365IT学院，让学习变得更简单！
 */

package com.itedu365.best5501;

/**
 *
 * 【Java代码与架构之完美优化——实战经典】
 *
 *  55、如何对异常进行封装
 *
 *  重构18 —— 用异常代替错误码
 *
 *  @author 颜廷吉
 */
public class Before {
    // 返回错误码方法
    public static String getErrorCode(int type) {
        if (type == 1) {
            return "E_SYS_001";
        } else {
            return "E_SYS_002";
        }
    }
}
