package com.utm;

import java.util.List;

public class TaskService implements ITaskService {
    private List<AbstractTask> tasks;

    TaskService(List<AbstractTask> tasks) {
        this.tasks = tasks;
    }

    @Override
    public void addNewTask(CreateTaskFrame creatorFrame) {
        AbstractTask task = new AbstractTask(creatorFrame.getTaskName(), creatorFrame.getTaskDescription());
        this.tasks.add(task);
        System.out.println(task.name);
        System.out.println(task.description);
    }
}
