package com.itedu365.best7401.test;

import com.itedu365.best7401.QueryDAOImplement;

public class BeforeTest {
    public static void main(String[] args) {
        QueryDAOImplement queryDAO = new QueryDAOImplement();
        System.out.println(queryDAO.executeQuery());
    }
}
