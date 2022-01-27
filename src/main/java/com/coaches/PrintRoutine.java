package com.coaches;

public class PrintRoutine {
    public static void main(String[] args) {
        Coach theCoach = new BaseBallCoach(null);
        System.out.println(theCoach.getCurrentWorkOut());
    }
}
