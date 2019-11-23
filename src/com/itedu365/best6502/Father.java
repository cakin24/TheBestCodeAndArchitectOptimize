/*
 * 本书配套视频教程网址（架构师系列培训）:
 *         www.365itedu.com
 * 365IT学院，让学习变得更简单！
 */
package com.itedu365.best6502;

import com.itedu365.best6502.service.Reader;
/**
*
* 【Java代码与架构之完美优化——实战经典】
*
*  65、架构优化原则 —— 依赖倒置原则
*
*  重构21  —— 提炼接口
*
*  @author 颜廷吉
*/
public class Father {
    // 讲故事
    public void speak(Reader reader) {
        System.out.println("爸爸开始讲故事......");
        System.out.println(reader.getContent());
    }

}
