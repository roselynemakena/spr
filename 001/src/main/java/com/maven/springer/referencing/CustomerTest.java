package com.maven.springer.referencing;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CustomerTest {

    public static void main(String args[]) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("mapconfig.xml");
        Customer customerBean = (Customer) context.getBean("customerBean");

        System.out.println("MAP :: "+customerBean.getProducts());
    }
}
