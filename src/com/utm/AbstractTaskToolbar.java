package com.utm;

import javax.swing.*;

public abstract class AbstractTaskToolbar extends JPanel {
    JButton removeTaskButton;

    JButton setInProgressButton;
    JButton setDoneButton;

    AbstractTask task;
    AbstractTaskService taskService;

    public AbstractTaskToolbar(AbstractTask task) {
        this.task = task;
        this.taskService = task.getTaskService();

        removeTaskButton = new JButton("-");
        removeTaskButton.addActionListener(actionEvent -> this.taskService.removeTask(task));
        add(removeTaskButton);

        setInProgressButton = new JButton("in progress");
        add(setInProgressButton);

        setDoneButton = new JButton("done");
        add(setDoneButton);
    }
}
