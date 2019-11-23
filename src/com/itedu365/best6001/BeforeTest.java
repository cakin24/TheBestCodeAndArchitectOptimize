/*
 * 本书配套视频教程网址（架构师系列培训）:
 *         www.365itedu.com
 * 365IT学院，让学习变得更简单！
 */
package com.itedu365.best6001;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class BeforeTest {
    public static void main(String args[]) {
        // 定义临时变量
        Integer arrayValue[] = new Integer[20000];
        Random random = new Random();
        // 数组赋值
        for (int i = 0; i < 20000; i++) {
            arrayValue[i] = random.nextInt(100) + 1;
        }
        // 数组转化成List
        List<Integer> values = Arrays.asList(arrayValue);
        // 性能测试
        System.out.println("ArrayList查询消耗时间：" + Before.searchListTime(new ArrayList<Integer>(values)));
        System.out.println("LinkedList查询消耗时间：" + Before.searchListTime(new LinkedList<Integer>(values)));
        System.out.println("ArrayList插入消耗时间：" + Before.addListFromHeaderTime(new ArrayList<Object>()));
        System.out.println("LinkedList插入消耗时间：" + Before.addListFromHeaderTime(new LinkedList<Object>()));

    }
}
