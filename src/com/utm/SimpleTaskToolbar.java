package com.utm;

import javax.swing.*;

public class SimpleTaskToolbar extends AbstractTaskToolbar {
    private JButton mkComposedTaskButton;

    public SimpleTaskToolbar(AbstractTask task) {
        super(task);

//        mkComposedTaskButton = new JButton("mk composed");
//        mkComposedTaskButton.addActionListener(actionEvent -> {
//           task.getTaskService().makeSimpleTaskComposed();
//        });
//        add(mkComposedTaskButton);
    }
}
