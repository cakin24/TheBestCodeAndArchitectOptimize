/*
 * 本书配套视频教程网址（架构师系列培训）:
 *         www.365itedu.com
 * 365IT学院，让学习变得更简单！
 */

package com.itedu365.best5302;

import java.util.zip.DataFormatException;

/**
 *
 * 【Java代码与架构之完美优化——实战经典】
 *
 *  53、避免在finally块中处理返回值
 *
 *  @author 颜廷吉
 */
public class After {
    public static int doStuff(int count) throws Exception {
        int result = 0;
        try {
            if (count < 0) {
                // 抛出DataFormatException
                throw new DataFormatException("数据格式错误");
            } else {
                result = count;
            }
        } catch (DataFormatException e) {
            e.printStackTrace();
            result = 1;
        }
        return result;
    }
}
