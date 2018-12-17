package com.maven.springer.referencing;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CarDealerTest {
    public static void main(String args[]) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("carconfig.xml");
        CarDealer cars = (CarDealer) context.getBean("cars");
        cars.getModels().forEach(
                s -> {
                    System.out.println(s);
                }
        );
        System.out.println("DEALER NAME"+cars.getName());
    }
}
