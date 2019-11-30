package com.utm;

import javax.swing.*;

public class AbstractTask extends JPanel implements IUserInterface {
    String name;
    String description;
    ITasksHolder subtasksPanel;
    TaskToolbar taskToolbar;
    AbstractTask parentTask;
    ITaskService taskService;

    public AbstractTask(String name, String description, AbstractTask parentTask) {
        taskService = new TaskService(this);
        this.parentTask = parentTask;
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        this.name = name;
        this.description = description;

        setBorder(BorderFactory.createTitledBorder(this.name));
        add(new JTextArea(description));

        subtasksPanel = new TasksHolderPanel();
        add((JPanel)subtasksPanel);

        taskToolbar = new TaskToolbar(this);
        add(taskToolbar);
    }

    public String getTaskName() {
        return name;
    }

    public String getTaskDescription() {
        return description;
    }

    public ITasksHolder getSubtasksPanel() {
        return subtasksPanel;
    }

    public AbstractTask getParentTask() {
        return parentTask;
    }

    public ITaskService getTaskService() {
        return taskService;
    }
}
