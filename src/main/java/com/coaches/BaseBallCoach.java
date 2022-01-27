package com.coaches;

import com.fortunes.FortuneService;

public class BaseBallCoach implements Coach{
    private FortuneService fortuneService;

    public BaseBallCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getCurrentWorkOut() {
        return "Arms * 10";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
