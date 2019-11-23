/*
 * 本书配套视频教程网址（架构师系列培训）:
 *         www.365itedu.com
 * 365IT学院，让学习变得更简单！
 */

package com.itedu365.best4502;

/**
 *
 * 【Java代码与架构之完美优化——实战经典】
 *
 *  45、避免实例化特有工具类
 *
 *  @author 颜廷吉
 */
public final class AfterTuils {
    // 私有化特殊工具类
    private AfterTuils() throws Exception {
        throw new Exception("不要实例化工具类！");
    }
    // 对外提供服务方法
    public static void methodForTool() {
        System.out.println("本系统特有工具类");
    }

}
