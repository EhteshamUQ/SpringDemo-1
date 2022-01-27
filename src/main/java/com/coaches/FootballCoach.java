package com.coaches;

import com.fortunes.FortuneService;

public class FootballCoach implements Coach{

    private FortuneService fortuneService;

    public FootballCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getCurrentWorkOut() {
        return "Squats * 100";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
    // Init Method
    public void findCoach(){
        System.out.println("Finding Coach");
        System.out.println("Found Coach");
    }

    //Destroy Method
    public void startWorkOut(){
        System.out.println("Going to Field to start Workout");
        System.out.println("Away from coach");
    }
}
