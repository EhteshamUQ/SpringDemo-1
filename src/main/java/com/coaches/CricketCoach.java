package com.coaches;

import com.fortunes.FortuneService;

public class CricketCoach implements Coach{
    private String name;

    public void setName(String name) {
        this.name = name;
    }
    private FortuneService fortune;
    @Override
    public String getCurrentWorkOut() {
        return "Practise Pull Shot";
    }

    public void setFortune(FortuneService fortune) {
        this.fortune = fortune;
    }

    @Override
    public String getDailyFortune() {
        return fortune.getFortune();
    }

    public String getName() {
        return name;
    }
}
