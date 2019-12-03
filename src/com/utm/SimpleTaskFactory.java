package com.utm;

public class SimpleTaskFactory implements ITaskFactory {
    @Override
    public AbstractTask createTask(String name, String description, ComposedTask parentTask) {
        return new SimpleTask(name, description, parentTask);
    }
}
