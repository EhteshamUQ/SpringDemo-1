package com.coaches;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Coach theCoach =  context.getBean("myCoach" , Coach.class);
        System.out.println(theCoach.getCurrentWorkOut());
        System.out.println(theCoach.getDailyFortune());

        CricketCoach cricCoach = context.getBean("cricketCoach" , CricketCoach.class);
        System.out.println(cricCoach.getCurrentWorkOut() + "\n" + cricCoach.getDailyFortune());
        System.out.println(cricCoach.getName());

        CricketCoach otherCoach = context.getBean("cricketCoach" , CricketCoach.class);
        System.out.println(otherCoach.getCurrentWorkOut() + "\n" + otherCoach.getDailyFortune());
        System.out.println(otherCoach.getName());
        context.close();
    }
}
