package com.itedu365.best6701.test;

import com.itedu365.best6701.MainCompanyManager;
import com.itedu365.best6701.SubCompanyManager;

public class BeforeTest {
    public static void main(String[] args){
               MainCompanyManager e = new MainCompanyManager();
               e.printAllEmployee(new SubCompanyManager());
           }

}
