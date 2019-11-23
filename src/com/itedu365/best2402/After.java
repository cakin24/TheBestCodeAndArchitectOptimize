/*
 * 本书配套视频教程网址（架构师系列培训）:
 *         www.365itedu.com
 * 365IT学院，让学习变得更简单！
 */

package com.itedu365.best2402;

/**
 *
 * 【Java代码与架构之完美优化——实战经典】
 *
 *  24、hashcode()与equals()是个孪生兄弟
 *
 *  @author 颜廷吉
 */
public class After {

    private String name = "365itedu";
    private short age = 2;

    public After(String name, short age) {
        this.name = name;
        this.age = age;
    }

    //重写了hashCode
    public int hashCode() {
        // 第一步，设定平衡因子
        final int balanceFactor = 17;
        int result = balanceFactor;
        // 第二步，计算基本类型hash值
        result = result * balanceFactor + age;
        // 第三步，计算非基本类型成员变量hash值
        return result * balanceFactor + name.hashCode();
    }

    //重写了equals
    public boolean equals(Object obj) {
        if (obj instanceof After) {
            String tempName = ((After) obj).name;
            short tempAge = ((After) obj).age;
            // 姓名与年龄一致
            return this.name.equals(tempName) && this.age == tempAge;
        } else {
            return false;
        }
    }
}
