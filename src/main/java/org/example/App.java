package org.example;

import org.example.view.Home;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.swing.*;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        /*BaseBallCoach baseBallCoach = new BaseBallCoach();
        System.out.println(baseBallCoach.getInstruction());*/

        /*CricketCoach cricketCoach = new CricketCoach();
        System.out.println(cricketCoach.getInstruction());*/

        /*Coach coach = new BaseBallCoach();
        System.out.println(coach.getInstruction());*/

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("application-context.xml");
        Coach coach1 = applicationContext.getBean("baseBallCoach", Coach.class);
        /*Coach coach2 = applicationContext.getBean("baseBallCoach", Coach.class);
        System.out.println("coach1 = " + coach1 + " coach2 = " + coach2);
        if (coach1.equals(coach2)) {
            System.out.println("Both Objects are equal");
        }
        else {
            System.out.println("Not equal");
        }*/
        /*System.out.println(coach1.getInstruction());*/

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Home();
            }
        });
    }
}
