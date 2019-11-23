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
public class QueryDAOiBatisSupport {
    // 模拟Spring中SqlMapClientTemplate方法
    public Object executeForObject(String sqlId) {
        // 取得数据库访问DAO
        SqlMapClientTemplate sqlMapTemp = SqlMapClientTemplate.getSqlMapClientTemplate();
        // 根据SQLID查询数据库并返回结果
        Object obj = sqlMapTemp.queryForObject(sqlId);
        return obj;
    }
}
