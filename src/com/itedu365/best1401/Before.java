/*
 * 本书配套视频教程网址（架构师系列培训）:
 *         www.365itedu.com
 * 365IT学院，让学习变得更简单！
 */
package com.itedu365.best1401;

/**
 *
 * 【Java代码与架构之完美优化——实战经典】
 *
 *  14、用Enum代替Integer类型码常量
 *
 *  重构05 —— 用枚举取代类型码
 *
 *  @author 颜廷吉
 */
public class Before {
    // 根据类型取得星期名称
    public static String getDayName(Integer type) {
        if (Consts.WEEK_MONDAY == type) {
            return "周一";
        } else if (Consts.WEEK_TUESDAY == type) {
            return "周二";
        } else if (Consts.WEEK_WEDNESDAY == type) {
            return "周三";
        } else if (Consts.WEEK_THURSDAY == type) {
            return "周四";
        } else if (Consts.WEEK_FRIDAY == type) {
            return "周五";
        } else if (Consts.WEEK_SATURDAY == type) {
            return "周六";
        } else{
            return "周日";
        }
    }
}
