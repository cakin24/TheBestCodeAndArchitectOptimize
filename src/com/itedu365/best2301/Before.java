/*
 * 本书配套视频教程网址（架构师系列培训）:
 *         www.365itedu.com
 * 365IT学院，让学习变得更简单！
 */

package com.itedu365.best2301;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * 【Java代码与架构之完美优化——实战经典】
 *
 *  23、最小化原则
 *
 *  重构09 —— 封装类成员
 *
 *  @author 颜廷吉
 */
public class Before {

    // 成员变量未封装
    public List<String> stuffList = new ArrayList<String>();

    public Before() {
        stuffList.add("张三");
        stuffList.add("张李四");
    }

    public void printFindResult(String name) {
        System.out.println("查询结果：" + foundStuff(name));
    }

    // 只供自己专用的方法未封装
    public String foundStuff(String stuff) {
        if (stuffList.contains(stuff)) {
            return "success";
        } else {
            return "fail";
        }
    }

}
