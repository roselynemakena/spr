package com.maven.springer.lifecycle.annotations;

import com.maven.springer.lifecycle.interfaces.PatientInterfac;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PatientTest {

    public static void main(String args[]) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("annotationsconfig.xml");
        Patient patient = (Patient) context.getBean("patient");

        System.out.println("PATIENT PAYLOAD : "+patient);

        context.registerShutdownHook();
    }
}
