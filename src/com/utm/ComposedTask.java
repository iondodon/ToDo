package com.utm;

import javax.swing.*;
import java.util.ArrayList;

public class ComposedTask extends AbstractTask {
    ITasksHolder subtasksPanel;
    ComposedTaskToolbar taskToolbar;
    AbstractTaskService taskService;

    public ComposedTask(String name, String description, ComposedTask parentTask) {
        super(name, description, parentTask);

        taskService = new ComposedTaskService(this);

        subtasksPanel = new TasksHolderPanel(this, new ArrayList<>());
        add((JPanel)subtasksPanel);

        taskToolbar = new ComposedTaskToolbar(this);
        add(taskToolbar);
    }

    public void setSubtasksPanel(ITasksHolder tasksHolder) {
        this.subtasksPanel = tasksHolder;
        this.subtasksPanel.getPanelHoldingTasks().validate();
        this.subtasksPanel.getPanelHoldingTasks().repaint();
    }

    @Override
    public AbstractTaskService getTaskService() {
        return taskService;
    }

    @Override
    public AbstractTaskToolbar getTaskToolbar() { return taskToolbar; }

    @Override
    public ITasksHolder getSubtasksPanel() {
        return subtasksPanel;
    }
}
