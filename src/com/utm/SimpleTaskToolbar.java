package com.utm;

import javax.swing.*;

public class SimpleTaskToolbar extends AbstractTaskToolbar {
    private JButton mkComposedButton;

    public SimpleTaskToolbar(AbstractTask task) {
        super(task);

//        mkComposedButton = new JButton("mk composed");
//        mkComposedButton.addActionListener(actionEvent -> {
//           task.getTaskService().makeSimpleTaskComposed();
//        });
//        add(mkComposedButton);
    }
}
