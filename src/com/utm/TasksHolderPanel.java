package com.utm;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class TasksHolderPanel extends JPanel implements ITasksHolder {
    private List<AbstractTask> tasks = new ArrayList<>();

    public TasksHolderPanel() {
        setBorder(BorderFactory.createTitledBorder("tasks"));
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
