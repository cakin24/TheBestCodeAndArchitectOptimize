/*
 * 本书配套视频教程网址（架构师系列培训）:
 *         www.365itedu.com
 * 365IT学院，让学习变得更简单！
 */

package com.itedu365.best1902;

/**
 *
 * 【Java代码与架构之完美优化——实战经典】
 *
 *  19、如何深入理解“==”的真正含义
 *
 *  @author 颜廷吉
 */
public class After {
	// 定义ID
	private Integer id;
	// 定义姓名
	private String name;

	// 重写equals方法
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (obj instanceof After) {
			After obj1 = (After) obj;
			// ID与Name都相等
			if (this.id.equals(obj1.getId()) && this.name.equals(obj1.getName())) {
				return true;
			}
		}
		return false;
	}

	// 重写hashCode方法
	public int hashCode() {
		final int prime = 17 * 31;
		int result = prime;
		result = prime + id;
		result = prime + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	public static void method() {
		// 对象1
		After theBest1 = new After();
		theBest1.setId(1);
		theBest1.setName("name1");
		// 对象2（内容和对象1一样）
		After theBest2 = new After();
		theBest2.setId(1);
		theBest2.setName("name1");
		// 判断是否相等
		if (theBest1.equals(theBest2)) {
			System.out.println("equal");
		} else {
			System.out.println("not equal");
		}
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
