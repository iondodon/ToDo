package com.utm;

import javax.swing.*;
import java.awt.*;

public class UserInterface implements IUserInterface {
    private JFrame mainFrame;
    private JPanel topPanel;
    private JPanel tasksListPanel;
    private JPanel bottomPanel;

    UserInterface() {
        mainFrame = new JFrame("TodoApp");
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel appName = new JLabel();
        appName.setText("TodoApp");
        topPanel = new JPanel();
        topPanel.add(appName);

        tasksListPanel = new JPanel();
        tasksListPanel.setBorder(BorderFactory.createTitledBorder("tasks"));

        JPanel task = new JPanel();
        task.setBorder(BorderFactory.createTitledBorder("task1"));
        JLabel taskName = new JLabel();
        taskName.setText("task1");
        task.add(taskName);

        tasksListPanel.add(task);
        


        bottomPanel = new JPanel();

        mainFrame.add(topPanel, BorderLayout.NORTH);
        mainFrame.add(tasksListPanel, BorderLayout.CENTER);
        mainFrame.add(bottomPanel, BorderLayout.SOUTH);


        mainFrame.pack();
    }

    @Override
    public void show() {
        mainFrame.setVisible(true);
    }
}
