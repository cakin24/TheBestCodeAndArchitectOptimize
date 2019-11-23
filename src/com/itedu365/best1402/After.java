/*
 * 本书配套视频教程网址（架构师系列培训）:
 *         www.365itedu.com
 * 365IT学院，让学习变得更简单！
 */

package com.itedu365.best1402;

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
public class After {

    // 根据类型取得星期名称
    public static String getDayName(Week type) {
        if (Week.MONDAY == type) {
            return "周一";
        } else if (Week.TUESDAY == type) {
            return "周二";
        } else if (Week.WEDNESDAY == type) {
            return "周三";
        } else if (Week.THURSDAY == type) {
            return "周四";
        } else if (Week.FRIDAY == type) {
            return "周五";
        }else if (Week.SATURDAY == type) {
             return "周六";
        }else{
             return "周日";
        }
    }
}
