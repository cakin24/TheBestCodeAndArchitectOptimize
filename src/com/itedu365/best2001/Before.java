/*
 * 本书配套视频教程网址（架构师系列培训）:
 *         www.365itedu.com
 * 365IT学院，让学习变得更简单！
 */

package com.itedu365.best2001;

/**
 *
 * 【Java代码与架构之完美优化——实战经典】
 *
 *  21、要习惯于用泛型代替原生类型
 *
 *  @author 颜廷吉
 */
public class Before {
	//定义一个通用类型成员
	private Object object;

	public Before(Object object) {
		this.object = object;
	}

	public void showType() {
		System.out.println("实际类型是: : " + object.getClass().getName());
	}

	public Object getObject() {
		return object;
	}

	public void setObject(Object object) {
		this.object = object;
	}
}
