package com.utm;

import java.util.ArrayList;
import java.util.List;

public class TodoApp {
    private static List<AbstractTask> tasks = new ArrayList<>();

    public static void main(String[] args) {
        new UserInterface().show();
    }

    public static List<AbstractTask> getTasks() {
        return tasks;
    }
}
