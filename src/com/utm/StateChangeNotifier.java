package com.utm;

import javax.swing.*;
import java.awt.*;
import java.util.Arrays;

public class StateChangeNotifier implements INotifier {
    private AbstractTask task;
    private MainFrame mainFrame;

    public StateChangeNotifier(AbstractTask task) {
        this.task = task;
        this.mainFrame = (MainFrame) Arrays.asList(Frame.getFrames()).get(0);
    }

    @Override
    public void notifyChange() {
        JLabel notificationLabel = mainFrame.getNotificationLabel();
        notificationLabel.setText("Task " + task.getTaskName() + " set to " + task.getState().getState() + ".");
    }
}
