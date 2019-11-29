package com.utm;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

class CreateTaskFrame extends JFrame {
    JTextField taskNameTextField;
    JTextField taskDescriptionTextField;
    TaskService taskService;

    CreateTaskFrame(List<AbstractTask> tasks) {
        super("New task");

        this.taskService = new TaskService(tasks);

        setSize( 150, 100 );
        setDefaultCloseOperation( JFrame.DISPOSE_ON_CLOSE );

        getContentPane().setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));

        taskNameTextField = new JTextField();
        add(taskNameTextField);

        taskDescriptionTextField = new JTextField();
        add(taskDescriptionTextField);

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

    public String getTaskDescription() {
        return this.taskDescriptionTextField.getText();
    }
}