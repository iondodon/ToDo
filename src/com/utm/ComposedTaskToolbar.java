package com.utm;

import javax.swing.*;

public class ComposedTaskToolbar extends AbstractTaskToolbar {
    JButton openAddSubtaskButton;

    public ComposedTaskToolbar(ComposedTask task) {
        super(task);

        openAddSubtaskButton = new JButton("+");
        openAddSubtaskButton.addActionListener(actionEvent -> new CreateTaskFrame(task));
        add(openAddSubtaskButton);
    }
}
