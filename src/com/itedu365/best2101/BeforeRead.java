/*
 * 本书配套视频教程网址（架构师系列培训）:
 *         www.365itedu.com
 * 365IT学院，让学习变得更简单！
 */

package com.itedu365.best2101;

/**
 *
 * 【Java代码与架构之完美优化——实战经典】
 *
 *  21、如何正确使用配符的边界
 *
 *  @author 颜廷吉
 */
import java.util.ArrayList;
import java.util.List;

public class BeforeRead {
    public static void method() {
        // 定义Double型临时变量
        List<Double> test1 = new ArrayList<Double>();
        test1.add(1.1);
        // 读出Double型临时变量
        read(test1);
        // 定义Integer型临时变量
        List<Integer> test2 = new ArrayList<Integer>();
        test2.add(2);
        // 读出Integer型临时变量
        read(test2);
    }

    //  通用方法：读出数字型数据
    public static void read(List<? extends Number> list) {
        for (Object e : list) {
            System.out.println(e);
        }
    }
}
