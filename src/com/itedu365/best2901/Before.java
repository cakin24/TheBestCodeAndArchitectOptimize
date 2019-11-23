/*
 * 本书配套视频教程网址（架构师系列培训）:
 *         www.365itedu.com
 * 365IT学院，让学习变得更简单！
 */

package com.itedu365.best2901;

/**
 *
 * 【Java代码与架构之完美优化——实战经典】
 *
 *  29、如何优化过长参数
 *
 *  重构10 —— 把参数提升成类成员变量
 *
 *  @author 颜廷吉
 */
public class Before {
    // 获取打折：VIP，8折；会员，9折
    public double getDiscount(String saleMan, String personType) {
        if ("1".equals(personType)) {
            System.out.println("销售人员" + saleMan + "给客户类型为VIP，打8折优惠。");
            return 0.8;
        }
        if ("2".equals(personType)) {
            System.out.println("销售人员" + saleMan + "客户类型为会员，打9折优惠。");
            return 0.9;
        }
        return 0;
    }
}
