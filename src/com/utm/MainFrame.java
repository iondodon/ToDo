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

        tasksPanel = new ComposedTask("TodoApp", "TodoApp", null);
        JScrollPane scrollPane = new JScrollPane(tasksPanel);

        add(scrollPane, BorderLayout.CENTER);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        pack();
        setVisible(true);
    }

    public JLabel getNotificationLabel() {
        return notificationLabel;
    }
}
