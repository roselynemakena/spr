package com.maven.springer.innerbeans;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeTest {

    public static void main(String args[]) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("innerbeans.xml");
        Employee emp001 = (Employee) context.getBean("employee");
        Employee emp002 = (Employee) context.getBean("employee");

        System.out.println("EMP PAYLOAD : "+emp001.hashCode());
        System.out.println("EMP PAYLOAD : "+emp002.hashCode());

        context.registerShutdownHook();
    }
}
