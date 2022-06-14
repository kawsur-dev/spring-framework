package org.example.view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Home {

    public Home() {
        JFrame jFrame = new JFrame("Home Page");
        jFrame.setSize(600, 500);
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jFrame.setVisible(true);
        LayoutManager layoutManager = new FlowLayout(FlowLayout.LEFT, 0, 20);
        jFrame.setLayout(layoutManager);
        final JLabel jLabel = new JLabel("This is a plain text");
        jFrame.add(jLabel);

        /*ImageIcon imageIcon = new ImageIcon();*/

        final JTextField jTextField = new JTextField();
        jTextField.setColumns(20);
        jFrame.add(jTextField);

        jTextField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                jLabel.setText(jTextField.getText());
            }
        });

        JButton alpha = new JButton("Alpha");
        JButton beta = new JButton("Beta");

        jFrame.add(alpha);
        jFrame.add(beta);

        alpha.addActionListener((n) -> jLabel.setText("alpha was clicked"));
        beta.addActionListener((n) -> jLabel.setText("beta was clicked"));
    }
}
