/*
 * 本书配套视频教程网址（架构师系列培训）:
 *         www.365itedu.com
 * 365IT学院，让学习变得更简单！
 */

package com.itedu365.best3202;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * 【Java代码与架构之完美优化——实战经典】
 *
 *  32、优雅的集合运算方法知多少
 *
 *  @author 颜廷吉
 */
public class After1 {

    public static void method() {
        // 临时变量list1
        List<String> list1 = new ArrayList<String>();
        list1.add("test1");
        list1.add("test1");
        list1.add("test2");
        // 临时变量list2
        List<String> list2 = new ArrayList<String>();
        list2.add("test2");
        list2.add("test3");

        // 交集list3 =  list1 共同的元素 list2
        List<String> list3 = new ArrayList<String>();
        list3.addAll(list1);
        list3.retainAll(list2);
        System.out.println("交集");
        System.out.println(list3.size());

        // 并集list4 =  list1 + list2
        List<String> list4 = new ArrayList<String>();
        list4.addAll(list1);
        list4.addAll(list2);
        System.out.println("并集");
        System.out.println(list4.size());

        // 差集list5 = list2 -list1
        List<String> list5 = new ArrayList<String>();
        list5.addAll(list2);
        list5.removeAll(list1);
        System.out.println("差集");
        System.out.println(list5.size());
        System.out.println(list5.get(0));

        // 无重复并集list6= list2 - list1 + list2
        List<String> list6 = new ArrayList<String>();
        list6.addAll(list1);
        list2.removeAll(list6);
        list6.addAll(list2);
        System.out.println("无重复并集");
        System.out.println(list6.size());
        System.out.println(list2.size());
    }
}
