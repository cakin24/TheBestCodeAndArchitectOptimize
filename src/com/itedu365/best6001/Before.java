/*
 * 本书配套视频教程网址（架构师系列培训）:
 *         www.365itedu.com
 * 365IT学院，让学习变得更简单！
 */

package com.itedu365.best6001;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 *
 * 【Java代码与架构之完美优化——实战经典】
 *
 *  60、在频繁插入与删除时使用LinkedList
 *
 *  @author 颜廷吉
 */
public class Before {
    // 测试List从头开始插入数据时间
   public static long addListFromHeaderTime(List<Object> list) {
        long startTime = System.currentTimeMillis();
        Object obj = new Object();
        for (int i = 0; i < 20000; i++) {
            //在头部频繁插入数据
            list.add(0, obj);
        }
        long endTime = System.currentTimeMillis();
        return endTime - startTime;
    }

   // 测试List查询时间
   public static long searchListTime(List<Integer> list) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 20000; i++) {
            // 二分法查询
            Collections.binarySearch(list, list.get(i));
        }
        long endTime = System.currentTimeMillis();
        return endTime - startTime;
    }
}
