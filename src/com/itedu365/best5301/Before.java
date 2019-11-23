/*
 * 本书配套视频教程网址（架构师系列培训）:
 *         www.365itedu.com
 * 365IT学院，让学习变得更简单！
 */

package com.itedu365.best5301;

import java.util.zip.DataFormatException;

/**
 *
 * 【Java代码与架构之完美优化——实战经典】
 *
 *  53、避免在finally块中处理返回值
 *
 *  @author 颜廷吉
 */
public class Before {
    public static int method(int count) throws Exception {
        try {
            if (count < 0) {
                // 抛出DataFormatException
                throw new DataFormatException("数据格式错误");
            } else {
                return count;
            }
        } catch (Exception e) {
            //异常处理
            return 1;
        } finally {
            // 返回固定值
            return -1;
        }
    }

}
