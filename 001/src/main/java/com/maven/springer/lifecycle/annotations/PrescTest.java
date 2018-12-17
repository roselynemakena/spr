package com.maven.springer.lifecycle.annotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PrescTest {
    public static void main(String args[]) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("depeconfig.xml");
        Prescription patient = (Prescription) context.getBean("prescription");

        System.out.println("PRESC PAYLOAD : "+patient);

        context.registerShutdownHook();
    }
}
