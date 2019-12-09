package com.utm;

import javax.swing.*;
import java.awt.*;

public class CreateTaskFrame extends JFrame {
    JTextField taskNameTextField;
    JTextArea taskDescriptionTextArea;
    AbstractTaskService taskService;

    CreateTaskFrame() {
        super("New subtask");

        setSize( 150, 50 );
        setDefaultCloseOperation( JFrame.DISPOSE_ON_CLOSE);

        getContentPane().setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));

        taskNameTextField = new JTextField();
        add(taskNameTextField);
        taskNameTextField.setMaximumSize(new Dimension(800,50));
        taskDescriptionTextArea = new JTextArea();
        add(taskDescriptionTextArea);
        taskDescriptionTextArea.setMaximumSize(new Dimension(800,80));

        JButton addSimpleTaskButton = new JButton("Add simple task");
        add(addSimpleTaskButton, BorderLayout.CENTER);
        CreateTaskFrame creatorFrame = this;
        addSimpleTaskButton.addActionListener(actionEvent -> {
            taskService.addNewSimpleSubtask(creatorFrame);
            creatorFrame.dispose();
        });
        add(addSimpleTaskButton);

        JButton addComposedTaskButton = new JButton("Add composed task");
        addComposedTaskButton.addActionListener(actionEvent -> {
            taskService.addNewComposedSubtask(creatorFrame);
            creatorFrame.dispose();
        });
        add(addComposedTaskButton);

        setVisible(true);
        setTitle("Add task");
        setBounds(601,200,400,200);
    }

    CreateTaskFrame(ComposedTask composedTask) {
        this();
        taskService = new ComposedTaskService(composedTask);
    }

    public String getTaskName() {
        return this.taskNameTextField.getText();
    }

    public String getTaskDescription() {
        return this.taskDescriptionTextArea.getText();
    }
}