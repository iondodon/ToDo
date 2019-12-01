package com.utm;

import javax.swing.*;

public abstract class AbstractTask extends JPanel implements IUserInterface {
    String name;
    String description;
    ComposedTask parentTask;

    public AbstractTask(String name, String description, ComposedTask parentTask) {
        this.parentTask = parentTask;
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        this.name = name;
        this.description = description;

        setBorder(BorderFactory.createTitledBorder(this.name));
        add(new JTextArea(description));
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

    public abstract ITaskService getTaskService();
}
