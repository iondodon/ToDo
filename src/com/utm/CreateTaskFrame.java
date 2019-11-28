package com.utm;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class CreateTaskFrame extends JFrame {
    ITaskService taskService;
    JTextField taskNameTextField;

    CreateTaskFrame(ITaskService taskService) {
        super("New task");

        this.taskService = taskService;

        setSize( 150, 100 );
        setDefaultCloseOperation( JFrame.DISPOSE_ON_CLOSE );

        setLayout( new FlowLayout() );

        taskNameTextField = new JTextField();
        add(taskNameTextField);

        JButton addTaskButton = new JButton("Add task");
        CreateTaskFrame creatorFrame = this;
        addTaskButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                taskService.addNewTask(creatorFrame);
            }
        });

        add(addTaskButton);

        super.setVisible(true);
    }

    public String getTaskName() {
        return this.taskNameTextField.getText();
    }
}