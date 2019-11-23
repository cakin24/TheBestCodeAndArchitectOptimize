/*
 * 本书配套视频教程网址（架构师系列培训）:
 *         www.365itedu.com
 * 365IT学院，让学习变得更简单！
 */

package com.itedu365.best6932;

/**
 *
 * 【Java代码与架构之完美优化——实战经典】
 *
 *  69、如何梳理混杂的架构体系
 *
 *  重构26 —— 折叠继承体系
 *
 *  @author 颜廷吉
 */
public class MyAction extends ActionSupport {
    public String delete() {
        // 根据消息ID从属性文件读取消息
        addActionMessage("MSG_001");
        return "success";
    }

}
