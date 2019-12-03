package com.utm;

import javax.swing.*;

public abstract class AbstractTask extends JPanel implements IUserInterface {
    private String name;
    private String description;
    private ComposedTask parentTask;
    private ITaskState state;
    private INotifier notifier;

    public AbstractTask(String name, String description, ComposedTask parentTask) {
        this.notifier = new StateChangeNotifier(this);
        this.parentTask = parentTask;
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        this.name = name;
        this.description = description;
        this.state = new TodoState(this);

        add(new JLabel(description));
    }

    public void notifyStateChange() {
        this.notifier.notifyChange();
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
    public abstract AbstractTaskToolbar getTaskToolbar();
    public abstract ITasksHolder getSubtasksPanel();
}
