package com.utm;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

public class DoneState implements ITaskState {
    private AbstractTask task;
    private StateEnum state;

    public DoneState(AbstractTask task) {
        this.task = task;
        this.state = StateEnum.Done;

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
        this.task.setState(new InProgressState(this.task));
    }

    @Override
    public void setDone() {
        new Alert("Already set to done");
    }

    @Override
    public void removeTask() {
        if(this.task.getTaskService().doneAllSubtasks(this.task)) {
            this.task.getTaskService().removeTask(this.task);
        } else {
            new Alert("You can delete this! The parent task and all subtasks have to be done.");
        }
    }
}
