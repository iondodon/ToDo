package com.utm;

public class InProgressState implements ITaskState {
    private AbstractTask task;

    public InProgressState(AbstractTask task) {
        this.task = task;
    }

    @Override
    public void setInProgress() {
        this.task.setState(new InProgressState(this.task));
    }

    @Override
    public void setDone() {
        this.task.setState(new DoneState(this.task));
    }

    @Override
    public void removeTask() {
        this.task.getTaskService().removeTask(this.task);
    }
}
