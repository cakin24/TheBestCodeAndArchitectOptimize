/*
 * 本书配套视频教程网址（架构师系列培训）:
 *         www.365itedu.com
 * 365IT学院，让学习变得更简单！
 */

package com.itedu365.best4102;

/**
 *
 * 【Java代码与架构之完美优化——实战经典】
 *
 *  41、避免使用对象的浅拷贝
 *
 *  @author 颜廷吉
 */
public class After {
	public static void method() {
		Mother mother = new Mother("母亲1");
		Mother child1 = new Mother("小孩1", mother);
		// 深拷贝方式复制对象
		Mother child2 = child1.clone();
		child2.setName("小孩2");
		//修改小孩2的母亲
		child2.getMother().setName("母亲2");
		System.out.println(child1.getName() + " 的母亲是： "
				+ child1.getMother().getName());
		System.out.println(child2.getName() + " 的母亲是： "
				+ child2.getMother().getName());
	}
}
