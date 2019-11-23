/*
 * 本书配套视频教程网址（架构师系列培训）:
 *         www.365itedu.com
 * 365IT学院，让学习变得更简单！
 */

package com.itedu365.best2701;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * 【Java代码与架构之完美优化——实战经典】
 *
 *  27、检查参数的有效性
 *
 *  @author 颜廷吉
 */
public class Before {
    // 通用正则表达式匹配方法
    public static boolean validate(String regEx, Object value) {
        Pattern pat = Pattern.compile(regEx);
        Matcher mat = pat.matcher(value.toString());
        if (!mat.find()) {
            return false;
        }
        return true;
    }

}
