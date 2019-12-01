package com.utm;

public interface ITaskService {
    void addNewComposedTask(CreateTaskFrame creatorFrame);
    void addNewSimpleTask(CreateTaskFrame creatorFrame);
    void removeTask(AbstractTask task);
}
