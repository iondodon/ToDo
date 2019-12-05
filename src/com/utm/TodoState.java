package com.utm;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

public class TodoState implements ITaskState {
    private AbstractTask task;
    private StateEnum state;

    public TodoState(AbstractTask task) {
        this.task = task;
        this.state = StateEnum.Todo;

        if(this.task.getParentTask() != null) {
            Border loweredetched = BorderFactory.createEtchedBorder(EtchedBorder.LOWERED);
            TitledBorder titledBorder = BorderFactory
                    .createTitledBorder(loweredetched, this.task.getTaskName() + ": " + this.state);
            titledBorder.setTitleJustification(TitledBorder.LEFT);
            this.task.setBorder(titledBorder);
        }
    }

    @Override
    public StateEnum getState() {
        return state;
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
