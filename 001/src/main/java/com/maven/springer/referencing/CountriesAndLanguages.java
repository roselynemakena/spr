package com.maven.springer.referencing;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CountriesAndLanguages {
    public static void main(String args[]) {
            ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("countryconfig.xml");
            Languages languages = (Languages) context.getBean("countriesAndLanguagesBean");

            System.out.println("PROP"+languages.getCountryAndLanguages());
        }

}
