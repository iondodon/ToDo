package com.utm;

import javax.swing.*;
import java.awt.*;

public class Alert extends JFrame {
    private String message;

    public Alert(String message) {
        super("Alert");
        this.message = message;

        add(new JLabel(message));
        setTitle("Alert");
        setBounds(150,300,300,100);
        setDefaultCloseOperation( JFrame.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));

        JButton okButton = new JButton("OK");
        add(okButton, BorderLayout.CENTER);
        JFrame alterFrame = this;
        okButton.addActionListener(actionEvent -> alterFrame.dispose());
        add(okButton);

        setVisible(true);
    }
}
