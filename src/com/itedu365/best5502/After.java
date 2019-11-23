/*
 * 本书配套视频教程网址（架构师系列培训）:
 *         www.365itedu.com
 * 365IT学院，让学习变得更简单！
 */

package com.itedu365.best5502;

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
public class After {

    // 用异常代替错误码
    public static void getErrorCode(int type) {
        if (type == 1) {
            throw new Itedu365Exception1("ERROE_CODE_001");
        } else {
            throw new Itedu365Exception1("ERROE_CODE_002");
        }
    }

}
