package com.utm;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

public class InProgressState implements ITaskState {
    private AbstractTask task;
    private StateEnum state;

    public InProgressState(AbstractTask task) {
        this.task = task;
        this.state = StateEnum.InProgress;

        Border loweredetched = BorderFactory.createEtchedBorder(EtchedBorder.LOWERED);
        TitledBorder titledBorder = BorderFactory
                .createTitledBorder(loweredetched, this.task.getTaskName() + ": " + this.state);
        titledBorder.setTitleJustification(TitledBorder.LEFT);
        this.task.setBorder(titledBorder);
    }

    public StateEnum getState() {
        return state;
    }

    @Override
    public void setInProgress() {
        new Alert("The task is already in progress.");
    }

    @Override
    public void setDone() {
        if(!this.task.getTaskService().doneAllSubtasks(this.task)){
            new Alert("All subtasks have to be done.");
            return;
        }
        this.task.setState(new DoneState(this.task));
    }

    @Override
    public void removeTask() {
        new Alert("Can't remove an undone task.");
    }
}
