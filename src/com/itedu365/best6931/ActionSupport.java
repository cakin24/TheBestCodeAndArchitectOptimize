/*
 * 本书配套视频教程网址（架构师系列培训）:
 *         www.365itedu.com
 * 365IT学院，让学习变得更简单！
 */

package com.itedu365.best6931;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 *
 * 【Java代码与架构之完美优化——实战经典】
 *
 *  69、如何梳理混杂的架构体系
 *
 *  重构26 —— 折叠继承体系
 *
 *  @author 颜廷吉
 */
//模拟struts2的ActionSupport
public class ActionSupport {
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