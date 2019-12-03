package com.utm;

import javax.swing.*;

public class ComposedTask extends AbstractTask {
    ITasksHolder subtasksPanel;
    ComposedTaskToolbar taskToolbar;
    AbstractTaskService taskService;

    public ComposedTask(String name, String description, ComposedTask parentTask) {
        super(name, description, parentTask);

        taskService = new ComposedTaskService(this);

        subtasksPanel = new TasksHolderPanel();
        add((JPanel)subtasksPanel);

        taskToolbar = new ComposedTaskToolbar(this);
        add(taskToolbar);
    }

    @Override
    public AbstractTaskService getTaskService() {
        return taskService;
    }

    @Override
    public AbstractTaskToolbar getTaskToolbar() { return taskToolbar; }

    public ITasksHolder getSubtasksPanel() {
        return subtasksPanel;
    }
}
