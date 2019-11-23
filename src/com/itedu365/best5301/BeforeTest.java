/*
 * 本书配套视频教程网址（架构师系列培训）:
 *         www.365itedu.com
 * 365IT学院，让学习变得更简单！
 */
package com.itedu365.best5301;

public class BeforeTest {
    public static void main(String[] args) {
        try {
            Before.method(-1);
            Before.method(100);
        } catch (Exception e) {
            System.out.println("这里是永远都不会到达的");
        }
    }
}
