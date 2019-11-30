package com.utm;

public interface ITaskService {
    void addNewTask(CreateTaskFrame creatorFrame);
    void removeTask(AbstractTask task);
}
