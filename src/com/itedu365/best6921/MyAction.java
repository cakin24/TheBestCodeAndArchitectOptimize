/*
 * 本书配套视频教程网址（架构师系列培训）:
 *         www.365itedu.com
 * 365IT学院，让学习变得更简单！
 */

package com.itedu365.best6921;

/**
 *
 * 【Java代码与架构之完美优化——实战经典】
 *
 *  69、如何梳理混杂的架构体系
 *
 *  重构25 —— 提炼继承体系
 *
 *  @author 颜廷吉
 */
public class MyAction extends ActionSupport {

    public String delete() {
        // 消息的内容如果想从属性文件读取，现在的架构就不方便了！
        addActionMessage("删除成功！");
        return "success";
    }

}
