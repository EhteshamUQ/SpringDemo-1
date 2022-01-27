package com;

import com.coaches.Coach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemo {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("otherContext.xml");

        Coach footBallCoach = context.getBean("myCoach" , Coach.class);
        Coach anotherBallCoach = context.getBean("myCoach" , Coach.class);
        System.out.println(footBallCoach == anotherBallCoach ? "Same Coach" : " Different Coaches");


        Coach cricketCoach = context.getBean("cricketCoach" , Coach.class);
        Coach anotherCricketCoach = context.getBean("cricketCoach" , Coach.class);
        System.out.println(cricketCoach == anotherCricketCoach ? "Same Coach" : " Different Coaches");
    }
}
