package com.utm;

import javax.swing.*;
import java.util.List;


public class ComposedTaskService implements ITaskService {
    private ComposedTask task;

    ComposedTaskService(ComposedTask task) {
        this.task = task;
    }

    @Override
    public void addNewComposedTask(CreateTaskFrame creatorFrame) {
        ITasksHolder panelHoldingTasks = task.getSubtasksPanel();

        List<AbstractTask> tasks = panelHoldingTasks.getTasks();
        AbstractTask newTask = new ComposedTask(
                creatorFrame.getTaskName(),
                creatorFrame.getTaskDescription(),
                task
        );
        tasks.add(newTask);

        JPanel subtasksPanel = (JPanel) task.getSubtasksPanel();
        subtasksPanel.removeAll();

        for(AbstractTask task: tasks) {
            subtasksPanel.add(task);
        }

        subtasksPanel.revalidate();
        subtasksPanel.repaint();
    }

    @Override
    public void addNewSimpleTask(CreateTaskFrame creatorFrame) {
        ITasksHolder panelHoldingTasks = task.getSubtasksPanel();

        List<AbstractTask> tasks = panelHoldingTasks.getTasks();
        AbstractTask newTask = new SimpleTask(
                creatorFrame.getTaskName(),
                creatorFrame.getTaskDescription(),
                task
        );
        tasks.add(newTask);

        JPanel subtasksPanel = (JPanel) task.getSubtasksPanel();
        subtasksPanel.removeAll();

        for(AbstractTask task: tasks) {
            subtasksPanel.add(task);
        }

        subtasksPanel.revalidate();
        subtasksPanel.repaint();
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
