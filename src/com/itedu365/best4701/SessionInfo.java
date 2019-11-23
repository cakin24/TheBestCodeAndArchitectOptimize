/*
 * 本书配套视频教程网址（架构师系列培训）:
 *         www.365itedu.com
 * 365IT学院，让学习变得更简单！
 */

package com.itedu365.best4701;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * 【Java代码与架构之完美优化——实战经典】
 *
 *  47、如何为臃肿的类进行手术
 *
 *  重构16 —— 分解类
 *
 *  @author 颜廷吉
 */
public class SessionInfo {
    // 放session内容的Map
    private Map<String, Object> session = new HashMap<String, Object>();
    // 用户姓名
    private String userName;
    // 用户ID
    private String userId;
    // 构造函数
    public void setSessionInfo() {
        userName = "yantingji";
        userId = "yantingji@365itedu.com";
        session.put("USER_NAME", userName);
        session.put("USER_ID", userId);
    }
    public Map<String, Object> getSession() {
        return session;
    }
}
