/*
 * 本书配套视频教程网址（架构师系列培训）:
 *         www.365itedu.com
 * 365IT学院，让学习变得更简单！
 */

package com.itedu365.best7412;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 *
 * 【Java代码与架构之完美优化——实战经典】
 *
 *  74、如何保持包的清晰
 *
 *  重构28 —— 规整包中类位置
 *
 *  @author 颜廷吉
 */
public class ServiceSupport {
      // 消息容器
      private List<String> actionMessageList = new ArrayList<String>();
      public void addActionMessage(String message) {
          actionMessageList.add(message);
      }
      //获取消息容器
      public Collection<String> getActionMessages() {
          return this.actionMessageList;
      }
}
