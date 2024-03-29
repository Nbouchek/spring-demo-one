package com.luv2code.springdemo;

public class TrackCoach implements Coach {
    private FortuneService fortuneService;

    public TrackCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    public TrackCoach() {

    }

    @Override
    public String getDaiLyWorkOut() {
        return "Run a hard 5k";
    }

    @Override
    public String getDailyFortune() {
        return "Just do it! " + fortuneService.getFortune();
    }

    // add an init methdd
    public void doMyStartupStuff() {
        System.out.println("TrackCoach: inside doMyStuff");
    }

    //  add a destroy method
    public void doMyCleanupStuff() {
        System.out.println("TrackCoack: inside method doMyCleanupStuff");
    }
}
