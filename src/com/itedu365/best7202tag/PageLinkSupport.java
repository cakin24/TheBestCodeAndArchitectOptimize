/*
 * 本书配套视频教程网址（架构师系列培训）:
 *         www.365itedu.com
 * 365IT学院，让学习变得更简单！
 */
package com.itedu365.best7202tag;
/**
*
* 【Java代码与架构之完美优化——实战经典】
*
*  72、架构优化原则 —— 共同封闭原则
*
*  @author 颜廷吉
*/
public class PageLinkSupport {
   // 取得属性结果处理，如果取得值为空，赋予默认值
   public static String getProperty(String key, String defaultValue){
       // 为节省代码，直接给结果赋值
       String value = "key";
       // 判断是否根据属性取得值，如果没有设置默认值
       if(value==null || "".equals(value)){
          return  defaultValue;
       }
        return value;
    }
}


