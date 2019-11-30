package com.utm;

import javax.swing.*;

class CreateTaskFrame extends JFrame {
    JTextField taskNameTextField;
    JTextField taskDescriptionTextField;
    TaskService taskService;


    CreateTaskFrame(AbstractTask task) {
        super("New task");

        this.taskService = new TaskService(task);

        setSize( 150, 100 );
        setDefaultCloseOperation( JFrame.DISPOSE_ON_CLOSE);

        getContentPane().setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));

        taskNameTextField = new JTextField();
        add(taskNameTextField);

        taskDescriptionTextField = new JTextField();
        add(taskDescriptionTextField);

        JButton addTaskButton = new JButton("Add task");
        CreateTaskFrame creatorFrame = this;
        addTaskButton.addActionListener(actionEvent -> {
            taskService.addNewTask(creatorFrame);
            creatorFrame.dispose();
        });

        add(addTaskButton);

        super.setVisible(true);
    }

    public String getTaskName() {
        return this.taskNameTextField.getText();
    }

    public String getTaskDescription() {
        return this.taskDescriptionTextField.getText();
    }
}