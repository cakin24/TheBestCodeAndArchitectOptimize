/*
 * 本书配套视频教程网址（架构师系列培训）:
 *         www.365itedu.com
 * 365IT学院，让学习变得更简单！
 */

package com.itedu365.best6912;

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
// 在这里就可以看到优秀的框架带来的威力了
public class QueryDAOiBatisSupport {
    // 体会泛型与通配符在架构中的重要作用
    @SuppressWarnings("unchecked")
    public <E> E executeForObject(String sqlId, Class<?> clazz) {
        // 取得数据库访问DAO
        SqlMapClientTemplate sqlMapTemp = SqlMapClientTemplate.getSqlMapClientTemplate();
        // 根据SQLID查询数据库并返回结果
        Object obj = sqlMapTemp.queryForObject(sqlId);
        // 根据参数类型转换成所需结果类型：架构的贴心服务
        E realObj = null;
        try {
            if (clazz != null && obj != null) {
                realObj = (E) clazz.cast(obj);
            }
        } catch (ClassCastException e) {
            e.getStackTrace();
        }
        return realObj;
    }
}
