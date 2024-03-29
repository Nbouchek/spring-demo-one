package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleDemoApp {
    public static void main(String[] args) {
        // load config file
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("BeanLifeCycleApplicationContext.xml");
        // retrieve bean from spring container
        Coach theCoach = context.getBean("myCoach", Coach.class);
        Coach alphaCoach = context.getBean("myCoach", Coach.class);

        //close context
        context.close();
    }
}
