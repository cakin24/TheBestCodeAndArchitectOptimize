/*
 * 本书配套视频教程网址（架构师系列培训）:
 *         www.365itedu.com
 * 365IT学院，让学习变得更简单！
 */
package com.itedu365.best6701;
/**
 *
 * 【Java代码与架构之完美优化——实战经典】
 *
 *  67、架构优化原则 —— 最少知道原则
 *
 *  @author 颜廷吉
*/
import java.util.ArrayList;
import java.util.List;

public class SubCompanyManager {
    // 得到子公司所有员工信息
    public List<SubEmployee> getAllSubEmployee(){
        List<SubEmployee> list = new ArrayList<SubEmployee>();
        for(int i=0; i<100; i++){
            SubEmployee emp = new SubEmployee();
            //为分公司人员按顺序分配一个ID
            emp.setId("分公司"+i);
            list.add(emp);
        }
        return list;
    }
}
