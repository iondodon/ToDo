package com.utm;

public class TodoState implements ITaskState {
    private AbstractTask task;

    public TodoState(AbstractTask task) {
        this.task = task;
    }

    @Override
    public void setInProgress() {
        this.task.setState(new InProgressState(this.task));
    }

    @Override
    public void setDone() {
        new Alert("Can't set to Done right from a new task.");
    }

    @Override
    public void removeTask() {
        new Alert("Can't remove an undone task.");
    }
}
