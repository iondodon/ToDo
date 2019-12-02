package com.utm;

public class InProgressState implements ITaskState {
    private AbstractTask task;

    private InProgressState(AbstractTask task) {
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
