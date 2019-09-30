package com.luv2code.springdemo;

public class BaseballCoach implements Coach{
    // define a primary field for the dependency
    private FortuneService fortuneService;

    // define ctor for dependency injection
    public BaseballCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDaiLyWorkOut() {
        return "Spend 30 minutes on batting practice";
    }


    @Override
    public String getDailyFortune() {
        // use my fortune service
        return fortuneService.getFortune();
    }
}
