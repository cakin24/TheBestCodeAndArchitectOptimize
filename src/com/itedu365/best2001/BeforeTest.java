/*
 * 本书配套视频教程网址（架构师系列培训）:
 *         www.365itedu.com
 * 365IT学院，让学习变得更简单！
 */

/*
 * 本书配套视频教程网址（架构师系列培训）:
 *         www.365itedu.com
 * 365IT学院，让学习变得更简单！
 */

package com.itedu365.best2001;

import java.util.ArrayList;
import java.util.List;

public class BeforeTest {
    public static void main(String[] args) {
        // 定义非泛型类的一个Integer版本
        Before intOb = new Before(new Integer(88));
        intOb.showType();
        int int1 = (Integer) intOb.getObject();
        System.out.println("value = " + int1);
        // 定义非泛型类的一个String版本
        Before strOb = new Before("Hello NoGen!");
        strOb.showType();
        String str = (String) strOb.getObject();
        System.out.println("value = " + str);
        // List容器混入掺杂类型对象
        List integerList = new ArrayList();
        integerList.add(365);
        integerList.add("机械工业出版社");
        System.out.println((Integer) integerList.get(1));
    }
}
