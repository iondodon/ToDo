package com.utm;

public class InProgressState implements ITaskState {
    private AbstractTask task;

    public InProgressState(AbstractTask task) {
        this.task = task;
    }

    @Override
    public void setInProgress() {
        new Alert("The task is already in progress.");
    }

    @Override
    public void setDone() {
        this.task.setState(new DoneState(this.task));
    }

    @Override
    public void removeTask() {
        new Alert("Can't remove an undone task.");
    }
}
