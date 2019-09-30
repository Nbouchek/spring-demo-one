package com.luv2code.springdemo;

public class VolleyballCoach implements Coach {
    // define filed for injection
    FortuneService fortuneService;

    // define ctor for dep injection
    public VolleyballCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDaiLyWorkOut() {
        return "Lift 25kg and walk 200m";
    }

    @Override
    public String getDailyFortune() {
        return "Volleyball, " + fortuneService.getFortune();
    }
}
