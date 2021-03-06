package org.example;

import org.example.dao.UserDao;
import org.example.domain.User;
import org.example.view.Home;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

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

        /*ApplicationContext applicationContext = new ClassPathXmlApplicationContext("application-context.xml");
        Coach coach1 = applicationContext.getBean("baseBallCoach", Coach.class);*/
        /*Coach coach2 = applicationContext.getBean("baseBallCoach", Coach.class);
        System.out.println("coach1 = " + coach1 + " coach2 = " + coach2);
        if (coach1.equals(coach2)) {
            System.out.println("Both Objects are equal");
        }
        else {
            System.out.println("Not equal");
        }*/
        /*System.out.println(coach1.getInstruction());*/

        /*SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Home();
            }
        });*/

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {


                JFrame jFrame = new JFrame("Home Page");
                jFrame.setSize(600, 500);
                jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
                jFrame.setVisible(true);
        LayoutManager layoutManager = new FlowLayout(FlowLayout.LEFT, 0, 20);
        jFrame.setLayout(layoutManager);

                final JTextField jTextField = new JTextField();
                jTextField.setColumns(20);
                jFrame.add(jTextField);


                JButton submit = new JButton("Submit");
                jFrame.add(submit);

                submit.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        ApplicationContext applicationContext1 = new ClassPathXmlApplicationContext("application-context.xml");
                        UserDao userDao = applicationContext1.getBean("userDao", UserDao.class);

                        int id = Integer.parseInt(jTextField.getText());
                        userDao.delete(id);

                        List<User> users = userDao.getAll();
                        for(User user: users) {
                            System.out.println(user.getEmail());
                        }
                    }
                });

            }
        });
    }
}
