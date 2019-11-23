/*
 * 本书配套视频教程网址（架构师系列培训）:
 *         www.365itedu.com
 * 365IT学院，让学习变得更简单！
 */

package com.itedu365.best2401;

/**
 *
 * 【Java代码与架构之完美优化——实战经典】
 *
 *  24、hashcode()与equals()是个孪生兄弟
 *
 *  @author 颜廷吉
 */
public class Before {
    private String name = "365itedu";
    private short age = 2;

    public Before(String name, short age) {
        this.name = name;
        this.age = age;
    }

    //重写了equals
    public boolean equals(Object obj) {
        if (obj instanceof Before) {
            String tempName = ((Before) obj).name;
            short tempAge = ((Before) obj).age;
            // 姓名与年龄一致
            return this.name.equals(tempName) && this.age == tempAge;
        } else {
            return false;
        }
    }

}
