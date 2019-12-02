package com.utm;

public class DoneState implements ITaskState {
    private AbstractTask task;

    public DoneState(AbstractTask task) {
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
