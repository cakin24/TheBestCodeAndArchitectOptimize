/*
 * 本书配套视频教程网址（架构师系列培训）:
 *         www.365itedu.com
 * 365IT学院，让学习变得更简单！
 */

package com.itedu365.best6802;

import org.apache.commons.lang3.StringUtils;

/**
 *
 * 【Java代码与架构之完美优化——实战经典】
 *
 *  68、如何扩展外部类功能
 *
 *  重构22 —— 引入本地扩展
 *
 *  @author 颜廷吉
 */
//StringUtil类是一个工具类，
//有很多开源包里面都有经典String扩展方法，先继承之后再扩展
public class StringUtil extends StringUtils {
    // 把NULL转换成空字符串
    public static String changeNullToStr(String str) {
        if (str == null) {
            return "";
        }
        return str;
    }

}
