package com.utm;

public class SimpleTask extends AbstractTask {
    SimpleTaskToolbar taskToolbar;
    AbstractTaskService taskService;

    public SimpleTask(String name, String description, ComposedTask parentTask) {
        super(name, description, parentTask);

        taskService = new SimpleTaskService(this);

        taskToolbar = new SimpleTaskToolbar(this);
        add(taskToolbar);
    }

    @Override
    public AbstractTaskService getTaskService() {
        return taskService;
    }
}
