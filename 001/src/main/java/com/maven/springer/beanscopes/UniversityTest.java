package com.maven.springer.beanscopes;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UniversityTest {

    public static void main(String args[]) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("uniconfig.xml");

        University university = (University) context.getBean("university");
        System.out.println(" University payload ::: "+university);

        context.registerShutdownHook();

    }
}
