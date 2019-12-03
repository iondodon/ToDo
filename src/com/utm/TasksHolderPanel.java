package com.utm;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.util.List;

public class TasksHolderPanel extends JPanel implements ITasksHolder {
    private List<AbstractTask> tasks;
    private AbstractTask holderTask;

    public TasksHolderPanel(AbstractTask holderTask, List<AbstractTask> tasks) {
        this.holderTask = holderTask;
        this.tasks = tasks;

        if(holderTask.getParentTask() != null) {
            TitledBorder border = BorderFactory.createTitledBorder("subtasks");
            border.setTitleJustification(TitledBorder.RIGHT);
            setBorder(border);
        }

        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
    }

    @Override
    public List<AbstractTask> getTasks() {
        return tasks;
    }

    @Override
    public JPanel getPanelHoldingTasks() {
        return this;
    }
}
