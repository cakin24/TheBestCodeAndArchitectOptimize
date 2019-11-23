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
public class After2 {

    public static void method() {
        // 临时变量list1
        List<String> list1 = new ArrayList<String>();
        list1.add("test1");
        list1.add("test1");
        list1.add("test2");

        // List错误的删除方法：从List头，开始进行判断，符合要求的数据进行删除，此时 i不断增长，list1的大小也是动态变化的，因此i的上限也是不断减小中，不能够全部判断每个list内容后，进行删除。
        System.out.println("List错误的删除方法");
        for (int i = 0; i < list1.size(); i++) {
            if ("test1".equals(list1.get(i))) {
                list1.remove(i);
            }
        }
        System.out.println(list1.size());

        // List正确的删除方法：从List尾，开始进行判断，符合要求的数据进行删除，此时 i不断减小，而i的范围是不变的，因此，够全部判断每个list内容后，进行删除。
        System.out.println("List正确的删除方法");
        list1.add("test1");
        for (int i = list1.size() - 1; i >= 0; i--) {
            if ("test1".equals(list1.get(i))) {
                list1.remove(i);
            }
        }
        System.out.println(list1.size());

    }

}
