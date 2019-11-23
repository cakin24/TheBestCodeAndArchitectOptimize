/*
 * 本书配套视频教程网址（架构师系列培训）:
 *         www.365itedu.com
 * 365IT学院，让学习变得更简单！
 */

package com.itedu365.best6911;

/**
 *
 * 【Java代码与架构之完美优化——实战经典】
 *
 *  69、如何梳理混杂的架构体系
 *
 *  重构24 —— 向下封装转型
 *
 *  @author 颜廷吉
 */
public class SqlMapClientTemplate {
    // 封装构方法
    private SqlMapClientTemplate() {
    }
    // 单粒模式
    public static SqlMapClientTemplate getSqlMapClientTemplate() {
        return new SqlMapClientTemplate();
    }

    // 返回查询结果
    public Object queryForObject(String sqlId) {
        // 为了减少代码，这里直接给出SQL查询结果
        return new Person("365itedu");
    }
}
