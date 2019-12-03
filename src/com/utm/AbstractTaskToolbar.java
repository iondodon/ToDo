package com.utm;

import javax.swing.*;
import java.awt.*;

public abstract class AbstractTaskToolbar extends JPanel {
    JButton removeTaskButton;

    JButton setInProgressButton;
    JButton setDoneButton;

    AbstractTask task;
    AbstractTaskService taskService;

    public AbstractTaskToolbar(AbstractTask task) {
        this.task = task;
        this.taskService = task.getTaskService();

        if(task.getParentTask() != null) {
            setInProgressButton = new JButton("in progress");
            setInProgressButton.addActionListener(actionEvent -> {
                this.task.getState().setInProgress();
                this.task.notifyStateChange();
            });
            add(setInProgressButton);

            setDoneButton = new JButton("done");
            setDoneButton.addActionListener(actionEvent -> {
                this.task.getState().setDone();
                this.task.notifyStateChange();
            });
            add(setDoneButton);

            removeTaskButton = new JButton("-");
            removeTaskButton.addActionListener(actionEvent -> {
                this.task.getState().removeTask();
            });
            add(removeTaskButton);
        }
    }

    public JButton getSetInProgressButton() {
        return this.setInProgressButton;
    }

    public JButton getSetDoneButton() {
        return this.setDoneButton;
    }
}
