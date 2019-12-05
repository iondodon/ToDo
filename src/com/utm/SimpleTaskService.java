package com.utm;

import java.awt.*;
import java.util.List;

public class SimpleTaskService extends AbstractTaskService {
    AbstractTask task;

    public SimpleTaskService(AbstractTask task) {
        this.task = task;
    }

    @Override
    public void makeSimpleTaskComposed() {
        List<AbstractTask> tasks = this.task.getParentTask().getSubtasksPanel().getTasks();
        for(int i = 0; i < tasks.size(); i++) {
            if(tasks.get(i) == this.task) {
                tasks.set(i, new ComposedTask(task.getTaskName(), task.getTaskDescription(), task.getParentTask()));
                task.getParentTask().setSubtasksPanel(new TasksHolderPanel(task.getParentTask(), tasks));
                break;
            }
        }
    }

    @Override
    public boolean doneAllSubtasks(AbstractTask task) {
        return true;
    }

    @Override
    public void addNewComposedSubtask(CreateTaskFrame creatorFrame) {
        System.out.println("A SimpleTask can't have subtasks.");
    }

    @Override
    public void addNewSimpleSubtask(CreateTaskFrame creatorFrame) {
        System.out.println("A SimpleTask can't have subtasks.");
    }
}
