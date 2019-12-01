package com.utm;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame implements IUserInterface {
    private JPanel topPanel;
    private JPanel tasksPanel;

    MainFrame() {
        super("TodoApp");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel appName = new JLabel();
        appName.setText("TodoApp");
        topPanel = new JPanel();
        topPanel.add(appName);

        tasksPanel = new ComposedTask("main", "main", null);
        JScrollPane scrollPane = new JScrollPane(tasksPanel);

        add(topPanel, BorderLayout.NORTH);
        add(scrollPane, BorderLayout.CENTER);

        pack();
        setVisible(true);
    }
}
