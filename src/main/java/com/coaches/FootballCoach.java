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
}
