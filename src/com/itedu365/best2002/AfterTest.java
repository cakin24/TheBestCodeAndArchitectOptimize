/*
 * 本书配套视频教程网址（架构师系列培训）:
 *         www.365itedu.com
 * 365IT学院，让学习变得更简单！
 */

package com.itedu365.best2002;

import java.util.ArrayList;
import java.util.List;

public class AfterTest {
    public static void main(String[] args) {
        // 定义泛型类的一个Integer版本
        After<Integer> intOb = new After<Integer>(88);
        intOb.showType();
        Integer int1 = intOb.getObject();
        System.out.println("value = " + int1);
        // 定义泛型类的一个String版本
        After<String> strOb = new After<String>("Hello BaseGen!");
        strOb.showType();
        String str = strOb.getObject();
        System.out.println("value = " + str);
        // List容器混入掺杂类型对象
        List<Integer> integerList = new ArrayList<Integer>();
        integerList.add(365);
        // integerList.add("机械工业出版社");
        System.out.println((Integer) integerList.get(1));
    }
}
