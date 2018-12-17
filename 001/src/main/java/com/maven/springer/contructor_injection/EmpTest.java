package com.maven.springer.contructor_injection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmpTest {
    public static void main(String args[]) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("conconfig.xml");
        Employee emp001 = (Employee) context.getBean("employee");
        Employee emp002 = (Employee) context.getBean("employee");

        System.out.println("EMP PAYLOAD : "+emp001);
        System.out.println("EMP PAYLOAD HASHCODE : "+emp002.hashCode());

        context.registerShutdownHook();
    }
}
