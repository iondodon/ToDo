package com.utm;

public interface ITaskFactory {
    AbstractTask createTask(String name, String description, ComposedTask parentTask);
}
