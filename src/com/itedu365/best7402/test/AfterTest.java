package com.itedu365.best7402.test;

import com.itedu365.best7401.QueryDAOImplement;

public class AfterTest {
    public static void main(String[] args) {
        QueryDAOImplement queryDAO = new QueryDAOImplement();
        System.out.println(queryDAO.executeQuery());
    }
}
