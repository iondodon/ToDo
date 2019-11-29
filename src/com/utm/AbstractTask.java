package com.utm;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class AbstractTask extends JPanel {
    String name;
    String description;

    private List<AbstractTask> tasks = new ArrayList<>();

    public AbstractTask(String name, String description) {
        this.name = name;
        this.description = description;

        add(new JTextArea(description));

        JButton openAddSubtaskButton = new JButton("Add subtask");
        openAddSubtaskButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                new CreateTaskFrame(tasks);
            }
        });

        setBorder(BorderFactory.createTitledBorder(this.name));
    }
}
