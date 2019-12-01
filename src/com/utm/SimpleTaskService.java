package com.utm;

import javax.swing.*;
import java.util.List;

public class SimpleTaskService implements ITaskService {
    public SimpleTaskService(SimpleTask simpleTask) {
    }

    @Override
    public void addNewComposedTask(CreateTaskFrame creatorFrame) {
        System.out.println("A simple task can't have subtasks.");
    }

    @Override
    public void addNewSimpleTask(CreateTaskFrame creatorFrame) {
        System.out.println("A simple task can't have subtasks.");
    }

    @Override
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

        JPanel parentSubtasksPanel = (JPanel) taskToRemove.getParentTask().getSubtasksPanel();
        parentSubtasksPanel.removeAll();

        for(AbstractTask task: tasks) {
            parentSubtasksPanel.add(task);
        }

        parentSubtasksPanel.revalidate();
        parentSubtasksPanel.repaint();
    }
}
