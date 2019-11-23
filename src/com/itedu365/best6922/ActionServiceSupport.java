/*
 * 本书配套视频教程网址（架构师系列培训）:
 *         www.365itedu.com
 * 365IT学院，让学习变得更简单！
 */

package com.itedu365.best6922;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

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
// 可以继承ActionSupport，在其基础上进行功能扩展
public class ActionServiceSupport extends ActionSupport {
    // 属性文件读取类
    private Properties pro;
    public ActionServiceSupport() {
        pro = new Properties();
        // 读取属性文件内容
        InputStream inputStream = Thread.currentThread().getContextClassLoader().getResourceAsStream("com/itedu365/best6342/prop.properties");//获取路径并转换成流
        try {
            pro.load(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    // 向消息容器添加消息
    public void addActionMessage(String message) {
        super.addActionMessage(pro.getProperty(message));
    }

}
