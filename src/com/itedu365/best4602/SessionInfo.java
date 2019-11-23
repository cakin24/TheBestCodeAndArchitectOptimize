/*
 * 本书配套视频教程网址（架构师系列培训）:
 *         www.365itedu.com
 * 365IT学院，让学习变得更简单！
 */

package com.itedu365.best4602;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * 【Java代码与架构之完美优化——实战经典】
 *
 *  46、避免有深度耦合的类关系
 *
 *  重构14 —— 移动变量（不具有父子关系）
 *
 *  @author 颜廷吉
 */
public class SessionInfo {
    // 放session内容的Map
    private Map<String, Object> session = new HashMap<String, Object>();
    public Map<String, Object> getSession() {
        return session;
    }
    public void setSession(Map<String, Object> session) {
        this.session = session;
    }
}
