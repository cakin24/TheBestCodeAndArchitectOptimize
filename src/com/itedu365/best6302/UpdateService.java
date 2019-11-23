/*
 * 本书配套视频教程网址（架构师系列培训）:
 *         www.365itedu.com
 * 365IT学院，让学习变得更简单！
 */

package com.itedu365.best6302;

/**
 *
 * 【Java代码与架构之完美优化——实战经典】
 *
 *  63、架构优化原则 —— 单一职责原则
 *
 *  重构19  —— 梳理并分解类职责
 *
 *  @author 颜廷吉
 */
public class UpdateService {
    // DB访问层方法
    public String getDBData(String param) {
        if ("admin".equals(param)) {
            return "1";
        }
        return "0";
    }
}
