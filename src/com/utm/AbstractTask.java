package com.utm;

import javax.swing.*;
import java.awt.*;

public class AbstractTask extends JPanel {
    String name;

    public AbstractTask(String name) {
        this.name = name;
        add(new Label(name));
    }
}
