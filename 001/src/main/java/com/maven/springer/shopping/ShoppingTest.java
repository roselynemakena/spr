package com.maven.springer.shopping;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ShoppingTest {
    public static void main(String args[]) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("shoppingconfig.xml");
        ShoppingCart shoppingCart = (ShoppingCart) context.getBean("shopping");

        System.out.println("CART PAYLOAD : "+shoppingCart);
    }
}
