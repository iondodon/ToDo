package com.utm;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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


        bottomPanel = new JPanel();
        JButton openCreateTaskFrame = new JButton("New task");
        openCreateTaskFrame.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                new CreateTaskFrame(TodoApp.getTasks());
            }
        });

        bottomPanel.add(openCreateTaskFrame);


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
