/*
 * 本书配套视频教程网址（架构师系列培训）:
 *         www.365itedu.com
 * 365IT学院，让学习变得更简单！
 */

package com.itedu365.best5601;

import java.io.IOException;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 *
 * 【Java代码与架构之完美优化——实战经典】
 *
 *  56、将优雅的异常信息反馈给用户
 *
 *  @author 颜廷吉
 */
public class Before {
    private static Log log = LogFactory.getLog(Before.class);
    public static void method(int connection ) {
        try {
            if (connection == 0) {
                throw new IOException();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
