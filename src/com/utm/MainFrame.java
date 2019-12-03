package com.utm;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame implements IUserInterface {
    private JPanel tasksPanel;

    MainFrame() {
        super("TodoApp");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        tasksPanel = new ComposedTask("TodoApp", "TodoApp", null);
        JScrollPane scrollPane = new JScrollPane(tasksPanel);

        add(scrollPane, BorderLayout.CENTER);

        pack();
        setVisible(true);
    }
}
