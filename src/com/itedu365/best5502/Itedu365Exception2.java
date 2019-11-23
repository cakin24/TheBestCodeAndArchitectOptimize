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
public class Itedu365Exception2 extends RuntimeException {
    // 错误编码
    private String errorCode;
    // 构造函数
    public Itedu365Exception2(String errorCode) {
        this.errorCode = errorCode;
    }
    public String getErrorCode() {
        return errorCode;
    }
    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }
}
