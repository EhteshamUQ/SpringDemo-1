package com;

import com.coaches.Coach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LifeCycleDemo {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("lifeCycleContext.xml");
       Coach fbCoach =  context.getBean("myCoach" , Coach.class);
        System.out.println(fbCoach.getCurrentWorkOut());
        context.close();
    }
}
