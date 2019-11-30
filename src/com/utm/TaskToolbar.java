package com.utm;

import javax.swing.*;

public class TaskToolbar extends JPanel {
    JButton openAddSubtaskButton;
    JButton removeTaskButton;

    JButton setInProgressButton;
    JButton setDoneButton;

    AbstractTask task;
    ITaskService taskService;

    public TaskToolbar(AbstractTask task) {
        this.task = task;
        this.taskService = task.getTaskService();

        openAddSubtaskButton = new JButton("+");
        openAddSubtaskButton.addActionListener(actionEvent -> new CreateTaskFrame(task));
        add(openAddSubtaskButton);

        removeTaskButton = new JButton("-");
        removeTaskButton.addActionListener(actionEvent -> this.taskService.removeTask(task));
        add(removeTaskButton);

        setInProgressButton = new JButton("in progress");
        add(setInProgressButton);

        setDoneButton = new JButton("done");
        add(setDoneButton);
    }
}
