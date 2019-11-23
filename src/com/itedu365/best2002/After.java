/*
 * 本书配套视频教程网址（架构师系列培训）:
 *         www.365itedu.com
 * 365IT学院，让学习变得更简单！
 */

package com.itedu365.best2002;

/**
 *
 * 【Java代码与架构之完美优化——实战经典】
 *
 *  21、要习惯于用泛型代替原生类型
 *
 *  @author 颜廷吉
 */
public class After<T> {
	//<T> 声明了一个泛型类，这个T没有任何限制，实际上相当于Object类型，
	// 实际上相当于 class GenericsFoo<T extends Object>。
	// T 可以换成A，a等任何字母，一般来说，习惯上我们用T
	private T object;

	public After(T object) {
		this.object = object;
	}

	public void showType() {
		System.out.println("实际类型是" + object.getClass().getName());
	}

	public T getObject() {
		return object;
	}

	public void setObject(T object) {
		this.object = object;
	}
}
