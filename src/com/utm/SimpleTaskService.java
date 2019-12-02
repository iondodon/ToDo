package com.utm;

public class SimpleTaskService extends AbstractTaskService {
    public SimpleTaskService(SimpleTask simpleTask) {

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
