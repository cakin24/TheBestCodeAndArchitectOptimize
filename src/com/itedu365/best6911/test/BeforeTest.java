package com.itedu365.best6911.test;
import com.itedu365.best6911.Person;
import com.itedu365.best6911.QueryDAOiBatisSupport;
public class BeforeTest {
    public static void main(String[] args) {
        // 获取QueryDAO
        QueryDAOiBatisSupport queryDAOiBatisSupport =
                new QueryDAOiBatisSupport();
        // 需要强制转换成所需类型
        Person person = (Person) queryDAOiBatisSupport.
                executeForObject("SQL001");
        System.out.println(person.getName());
    }
}

