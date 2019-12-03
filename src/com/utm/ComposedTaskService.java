package com.utm;

import java.util.List;


public class ComposedTaskService extends AbstractTaskService {
    private ComposedTask task;

    ComposedTaskService(ComposedTask task) {
        this.task = task;
    }

    @Override
    public void addNewComposedSubtask(CreateTaskFrame creatorFrame) {
        ITasksHolder panelHoldingTasks = task.getSubtasksPanel();

        List<AbstractTask> tasks = panelHoldingTasks.getTasks();
        AbstractTask newTask = new ComposedTask(
                creatorFrame.getTaskName(),
                creatorFrame.getTaskDescription(),
                task
        );
        tasks.add(newTask);

        updateJPanel(task, tasks);
    }

    @Override
    public void addNewSimpleSubtask(CreateTaskFrame creatorFrame) {
        ITasksHolder panelHoldingTasks = task.getSubtasksPanel();

        List<AbstractTask> tasks = panelHoldingTasks.getTasks();
        AbstractTask newTask = new SimpleTask(
                creatorFrame.getTaskName(),
                creatorFrame.getTaskDescription(),
                task
        );
        tasks.add(newTask);

        updateJPanel(task, tasks);
    }

    @Override
    public void makeSimpleTaskComposed() {
        System.out.println("The task is already composed.");
    }
}
