package com.utm;

import javax.swing.*;

public abstract class AbstractTask extends JPanel implements IUserInterface {
    private String name;
    private String description;
    private ComposedTask parentTask;
    private ITaskState state;

    public AbstractTask(String name, String description, ComposedTask parentTask) {
        this.parentTask = parentTask;
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        this.name = name;
        this.description = description;

        setBorder(BorderFactory.createTitledBorder(this.name));
        add(new JLabel(description));

        state = new TodoState(this);
    }

    public ITaskState getState() {
        return state;
    }

    public void setState(ITaskState state) {
        this.state = state;
    }

    public String getTaskName() {
        return name;
    }

    public String getTaskDescription() {
        return description;
    }

    public ComposedTask getParentTask() {
        return parentTask;
    }

    public abstract AbstractTaskService getTaskService();
}
