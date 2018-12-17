package com.maven.springer.referencing;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class Test
{
    public static void main( String[] args )
    {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("configuration.xml");
        Employee emp = (Employee) context.getBean("emp");

        System.out.println(" Employee ID : " +emp.getId());
        System.out.println(" Employee Name : " +emp.getName());
    }
}
