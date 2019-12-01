package com.utm;

import javax.swing.*;

public class CreateTaskFrame extends JFrame {
    JTextField taskNameTextField;
    JTextField taskDescriptionTextField;
    ITaskService taskService;

    CreateTaskFrame() {
        super("New task");

        setSize( 150, 100 );
        setDefaultCloseOperation( JFrame.DISPOSE_ON_CLOSE);

        getContentPane().setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));

        taskNameTextField = new JTextField();
        add(taskNameTextField);

        taskDescriptionTextField = new JTextField();
        add(taskDescriptionTextField);

        JButton addSimpleTaskButton = new JButton("add st");
        CreateTaskFrame creatorFrame = this;
        addSimpleTaskButton.addActionListener(actionEvent -> {
            taskService.addNewSimpleTask(creatorFrame);
            creatorFrame.dispose();
        });
        add(addSimpleTaskButton);

        JButton addComposedTaskButton = new JButton("add ct");
        addComposedTaskButton.addActionListener(actionEvent -> {
            taskService.addNewComposedTask(creatorFrame);
            creatorFrame.dispose();
        });
        add(addComposedTaskButton);

        super.setVisible(true);
    }

    CreateTaskFrame(ComposedTask composedTask) {
        this();
        taskService = new ComposedTaskService(composedTask);
    }

    public String getTaskName() {
        return this.taskNameTextField.getText();
    }

    public String getTaskDescription() {
        return this.taskDescriptionTextField.getText();
    }
}