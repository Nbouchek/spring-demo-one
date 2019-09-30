package com.luv2code.springdemo;

public class CricketCoach implements Coach {

    // sdd new fields for literal injection
    private String team;
    private String emailAddress;

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        System.out.println("CricketCoach: inside setTeam");
        this.team = team;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        System.out.println("CricketCoach: inside setEmailAddress");
        this.emailAddress = emailAddress;
    }

    // create field for injection
    FortuneService fortuneService;

    public CricketCoach (){
        System.out.println("CricketCoach: inside no-args ctor");
    }

    public FortuneService getFortuneService() {
        return fortuneService;
    }

    public void setFortuneService(FortuneService fortuneService) {
        System.out.println("CricketCoach: inside setter");
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDaiLyWorkOut() {
        return "Practice fast bowling for 15 min";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
