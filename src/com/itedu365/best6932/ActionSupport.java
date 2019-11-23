/*
 * 本书配套视频教程网址（架构师系列培训）:
 *         www.365itedu.com
 * 365IT学院，让学习变得更简单！
 */

package com.itedu365.best6932;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Properties;

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
//模拟struts2的ActionSupport
public class ActionSupport {
    // 属性文件读取类
    private Properties pro;
    // 消息容器
    private List<String> actionMessageList = new ArrayList<String>();

    // 构造函数
    public ActionSupport() {
        pro = new Properties();
        // 获取路径并转换成流
        InputStream inputStream = Thread.currentThread().getContextClassLoader().getResourceAsStream("com/itedu365/best6352/prop.properties");
        try {
            pro.load(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // 向消息容器添加消息
    public void addActionMessage(String message) {
        actionMessageList.add(pro.getProperty(message));
    }

    //获取消息容器
    public Collection<String> getActionMessages() {
        return this.actionMessageList;
    }
}