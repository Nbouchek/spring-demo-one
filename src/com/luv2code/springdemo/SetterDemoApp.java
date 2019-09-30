package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {
    public static void main(String[] args) {
        // load spring configuration  file
        ClassPathXmlApplicationContext context=
                new ClassPathXmlApplicationContext("ApplicationContext.xml");
        // retrieve bean
        CricketCoach theCoach = context.getBean("myCricketCoach", CricketCoach.class);

        // call methods on bean
        System.out.println(theCoach.getDaiLyWorkOut());
        System.out.println(theCoach.getDailyFortune());

        // call literal injection values
        System.out.println(theCoach.getEmailAddress());
        System.out.println(theCoach.getTeam());
        // close context
        context.close();
    }
}
