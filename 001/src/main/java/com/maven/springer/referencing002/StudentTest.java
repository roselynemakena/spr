package com.maven.springer.referencing002;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentTest {
    public static void main(String args[]) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("refconfig.xml");
        Student student = (Student) context.getBean("student");

        System.out.println("Student "+student);
    }
}


