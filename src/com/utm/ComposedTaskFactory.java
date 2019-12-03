package com.utm;

public class ComposedTaskFactory implements ITaskFactory {
    @Override
    public AbstractTask createTask(String name, String description, ComposedTask parentTask) {
        return new ComposedTask(name, description, parentTask);
    }
}
