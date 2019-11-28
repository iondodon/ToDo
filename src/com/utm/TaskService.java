package com.utm;
import java.util.ArrayList;
import java.util.List;

public class TaskService implements ITaskService {
    private List<AbstractTask> tasks = new ArrayList<>();

    @Override
    public void addNewTask(CreateTaskFrame creatorFrame) {
        AbstractTask task = new AbstractTask(creatorFrame.getTaskName());
        tasks.add(task);
        System.out.println(task.name);
        System.out.println();
    }
}
