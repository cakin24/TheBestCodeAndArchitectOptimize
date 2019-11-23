/*
 * 本书配套视频教程网址（架构师系列培训）:
 *         www.365itedu.com
 * 365IT学院，让学习变得更简单！
 */

package com.itedu365.best4101;

/**
 *
 * 【Java代码与架构之完美优化——实战经典】
 *
 *  41、不要使用对象的浅拷贝
 *
 *  @author 颜廷吉
 */
public class Mother implements Cloneable {
	private String name;
	private Mother mother;

	// 构造函数
	public Mother(String name) {
		this.name = name;
	}

	// 构造函数
	public Mother(String name, Mother mother) {
		this.name = name;
		this.mother = mother;
	}

	@Override
	// 浅拷贝
	public Mother clone() {
		Mother person = null;
		try {
			person = (Mother) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return person;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Mother getMother() {
		return mother;
	}

	public void setMother(Mother mother) {
		this.mother = mother;
	}
}
