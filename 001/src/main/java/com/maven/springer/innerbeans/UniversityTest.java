package com.maven.springer.innerbeans;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UniversityTest {

    public static void main(String args[]) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("uniconfog.xml");
        University university001 = (University) context.getBean("university");
        University university002 = (University) context.getBean("university");

        System.out.println("UNI PAYLOAD : "+university001.hashCode());
        System.out.println("UNI PAYLOAD : "+university002.hashCode());

        context.registerShutdownHook();
    }
}
