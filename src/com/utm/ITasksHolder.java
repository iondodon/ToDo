package com.utm;

import javax.swing.*;
import java.util.List;

public interface ITasksHolder {
    List<AbstractTask> getTasks();
    JPanel getPanelHoldingTasks();
}
