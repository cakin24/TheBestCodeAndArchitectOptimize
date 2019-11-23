package com.itedu365.best6912.test;
import com.itedu365.best6912.Person;
import com.itedu365.best6912.QueryDAOiBatisSupport;
public class AfterTest {
    public static void main(String[] args) {
        // 获取QueryDAO
        QueryDAOiBatisSupport queryDAOiBatisSupport =
                new QueryDAOiBatisSupport();
        // 根据传递的参数类型框架直接转换
        Person person = queryDAOiBatisSupport.
                executeForObject("SQL001", Person.class);
        System.out.println(person.getName());
    }
}

