/*
 * 本书配套视频教程网址（架构师系列培训）:
 *         www.365itedu.com
 * 365IT学院，让学习变得更简单！
 */

package com.itedu365.best4622;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * 【Java代码与架构之完美优化——实战经典】
 *
 *  46、避免有深度耦合的类关系
 *
 *  重构15 —— 移动方法（不具有父子关系）
 *
 *  @author 颜廷吉
 */
public class DateUtil {
    // 提取到时间工具类里
    public static String getFormatedCurrentDate(String format) {
        if (format != null && !"".equals(format)) {
            SimpleDateFormat fmt = new SimpleDateFormat(format);
            Calendar calendar = Calendar.getInstance();
            Date date = calendar.getTime();
            String sysDatetime = fmt.format(date);
            return sysDatetime;
        }
        return format;
    }
}
