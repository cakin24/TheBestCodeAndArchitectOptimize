/*
 * 本书配套视频教程网址（架构师系列培训）:
 *         www.365itedu.com
 * 365IT学院，让学习变得更简单！
 */

package com.itedu365.best3302;

import org.apache.commons.lang3.StringUtils;

/**
 *
 * 【Java代码与架构之完美优化——实战经典】
 *
 *  33、避免重复发明轮子
 *
 *  @author 颜廷吉
 */
public class After {
    public static void method() {
        String emptyStr = "";
        String nullStr = null;
        // 利用既存开源包里的方法
        System.out.println(StringUtils.isEmpty(emptyStr));
        System.out.println(StringUtils.isEmpty(nullStr));
    }
}
