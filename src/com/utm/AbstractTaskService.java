package com.utm;

import javax.swing.*;
import java.util.List;

public abstract class AbstractTaskService {

    AbstractTaskService() {

    }

    public void updateJPanel(ComposedTask task, List<AbstractTask> tasks) {
        JPanel subtasksPanel = (JPanel) task.getSubtasksPanel();
        subtasksPanel.removeAll();

        for(AbstractTask tsk: tasks) {
            subtasksPanel.add(tsk);
        }

        subtasksPanel.revalidate();
        subtasksPanel.repaint();
    }

    public void removeTask(AbstractTask taskToRemove) {
        ComposedTask parentTask = taskToRemove.getParentTask();

        if(parentTask == null){
            return;
        }

        List<AbstractTask> tasks = parentTask.getSubtasksPanel().getTasks();

        for(AbstractTask task: tasks) {
            if (task == taskToRemove) {
                tasks.remove(task);
                break;
            }
        }

        updateJPanel(parentTask, tasks);
    }

    public abstract void addNewComposedSubtask(CreateTaskFrame creatorFrame);
    public abstract void addNewSimpleSubtask(CreateTaskFrame creatorFrame);
    public abstract void makeSimpleTaskComposed();
    public abstract boolean doneAllSubtasks(AbstractTask task);
}
