package com.itedu365.best6402.test;

import com.itedu365.best6402.Man;
import com.itedu365.best6402.Woman;

public class AfterTest {
    public static void main(String[] args) {
        System.out.println("我是男人！");
        Man man = new Man();
        man.doBeard();
        man.working();

        System.out.println("我是女人！");
        Woman woman = new Woman();
        woman.bearing();
        woman.working();

    }
}
