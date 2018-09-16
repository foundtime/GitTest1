package com.iyoker.java8;

import java.util.ArrayList;
import java.util.Date;

public class FirstTest {
    String name;
    int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public FirstTest() {
    }

    public static void main(String[] args) {
        System.out.println("hello world,我的时间,我的世界你好!");
        ArrayList list = new ArrayList();

        final Date date = new Date();
        list.add(0, 1223);
        list.add(1, 2);
        list.add(123);
        System.out.println("args = [" + args + "]");
        System.out.println("FirstTest.main");

        if (date != null) {
            
        }
        if (date == null) {
            
        }
        if (list != null) {

        }
        if (list != null) {

        }
//synchronized ()


    }




}
