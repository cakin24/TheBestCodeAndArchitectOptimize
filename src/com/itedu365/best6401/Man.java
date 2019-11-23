/*
 * 本书配套视频教程网址（架构师系列培训）:
 *         www.365itedu.com
 * 365IT学院，让学习变得更简单！
 */
package com.itedu365.best6401;
/**
 *
 * 【Java代码与架构之完美优化——实战经典】
 *
 *  64、架构优化原则 —— 接口隔离原则
 *
 *  重构20  —— 隔离接口
 *
 *  @author 颜廷吉
*/
public class Man implements Person{
    // 刮胡子
    @Override
    public void doBeard() {
        System.out.println("正在刮胡子！");
    }
    // 公司工作
    @Override
    public void working() {
        System.out.println("正在公司工作！");
    }
    // 生小孩
    @Override
    public void bearing() {
    }
}
