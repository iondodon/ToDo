package com.utm;

import javax.swing.*;

public class CreateTaskFrame extends JFrame {
    JTextField taskNameTextField;
    JTextArea taskDescriptionTextArea;
    AbstractTaskService taskService;

    CreateTaskFrame() {
        super("New subtask");

        setSize( 150, 100 );
        setDefaultCloseOperation( JFrame.DISPOSE_ON_CLOSE);

        getContentPane().setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));

        taskNameTextField = new JTextField();
        add(taskNameTextField);

        taskDescriptionTextArea = new JTextArea();
        add(taskDescriptionTextArea);

        JButton addSimpleTaskButton = new JButton("add st");
        CreateTaskFrame creatorFrame = this;
        addSimpleTaskButton.addActionListener(actionEvent -> {
            taskService.addNewSimpleSubtask(creatorFrame);
            creatorFrame.dispose();
        });
        add(addSimpleTaskButton);

        JButton addComposedTaskButton = new JButton("add ct");
        addComposedTaskButton.addActionListener(actionEvent -> {
            taskService.addNewComposedSubtask(creatorFrame);
            creatorFrame.dispose();
        });
        add(addComposedTaskButton);

        setVisible(true);
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