/*
 * 本书配套视频教程网址（架构师系列培训）:
 *         www.365itedu.com
 * 365IT学院，让学习变得更简单！
 */
package com.itedu365.best6711;

import java.util.ArrayList;
import java.util.List;
/**
 *
 * 【Java代码与架构之完美优化——实战经典】
 *
 *  67、架构优化原则 —— 最少知道原则
 *
 *  @author 颜廷吉
*/
public class MainCompanyManager {
    // 得到母公司员工信息
    public List<MainEmployee> getAllMainEmployee(){
        List<MainEmployee> list = new ArrayList<MainEmployee>();
        for(int i=0; i<30; i++){
            MainEmployee emp = new MainEmployee();
            //为总公司人员按顺序分配一个ID
            emp.setId("总公司"+i);
            list.add(emp);
        }
        return list;
    }
    // 打印母公司所有员工信息
    public void printMainEmployee(){
         List<MainEmployee> list2 = this.getAllMainEmployee();
         for(MainEmployee e:list2){
             System.out.println(e.getId());
         }
    }
    // 打印母公司与子公司所有员工信息
    public void printAllEmployee(SubCompanyManager sub){
        sub.printSubEmployee();
        this.printMainEmployee();

    }

}
