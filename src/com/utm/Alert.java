package com.utm;

import javax.swing.*;

public class Alert extends JFrame {
    private String message;

    public Alert(String message) {
        super("Alert");
        this.message = message;

        add(new JLabel(message));

        setSize( 150, 100 );
        setDefaultCloseOperation( JFrame.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));

        JButton okButton = new JButton("ok");
        JFrame alterFrame = this;
        okButton.addActionListener(actionEvent -> alterFrame.dispose());
        add(okButton);

        setVisible(true);
    }
}
