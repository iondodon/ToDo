package com.utm;

import java.util.List;


public class ComposedTaskService extends AbstractTaskService {
    private ComposedTask task;
    private ITaskFactory simpleTaskFactory;
    private ITaskFactory composedTaskFactory;

    ComposedTaskService(ComposedTask task) {
        this.task = task;
        this.simpleTaskFactory = new SimpleTaskFactory();
        this.composedTaskFactory = new ComposedTaskFactory();
    }

    @Override
    public void addNewComposedSubtask(CreateTaskFrame creatorFrame) {
        ITasksHolder panelHoldingTasks = task.getSubtasksPanel();

        List<AbstractTask> tasks = panelHoldingTasks.getTasks();
        AbstractTask newTask = this.composedTaskFactory.createTask(
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
        AbstractTask newTask = this.simpleTaskFactory.createTask(
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
