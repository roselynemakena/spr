package com.maven.springer.referencing;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HospTest {

    public static void main(String args[]) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("listconfiguration.xml");
        Hospital hospital = (Hospital) context.getBean("hosi");


        System.out.println(" NAME : " +hospital.getName());
        System.out.println(" DEPARTMENTS : " +hospital.getDepartments().getClass());

    }
}
