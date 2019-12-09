package com.utm;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame implements IUserInterface {
    private JLabel notificationLabel;
    private JPanel tasksPanel;

    public MainFrame() {
        super("TodoApp");
        notificationLabel = new JLabel("Notification goes here.");
        add(notificationLabel, BorderLayout.NORTH);
    notificationLabel.setSize(970,20);
        tasksPanel = new ComposedTask("TodoApp", "TodoApp", null);
        JScrollPane scrollPane = new JScrollPane(tasksPanel);
        tasksPanel.setSize(970, 600);
        add(scrollPane, BorderLayout.CENTER);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        pack();
        setVisible(true);
        setTitle("ToDo");
        setBounds(0,200,600,600);
    }

    public JLabel getNotificationLabel() {
        return notificationLabel;
    }
}
