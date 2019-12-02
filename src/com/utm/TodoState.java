package com.utm;

public class TodoState implements ITaskState {
    private AbstractTask task;

    public TodoState(AbstractTask task) {
        this.task = task;
    }

    @Override
    public void setInProgress() {

    }

    @Override
    public void setDone() {

    }

    @Override
    public void removeTask() {

    }
}
