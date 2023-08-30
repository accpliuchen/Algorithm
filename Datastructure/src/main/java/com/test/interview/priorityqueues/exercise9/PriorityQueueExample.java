package com.test.interview.priorityqueues.exercise9;

import java.util.Comparator;
import java.util.PriorityQueue;

class Task {
    private int priority;
    private String description;

    public Task(int priority, String description) {
        this.priority = priority;
        this.description = description;
    }

    public int getPriority() {
        return priority;
    }

    public String getDescription() {
        return description;
    }
}

public class PriorityQueueExample {
    public static void main(String[] args) {
        // Create a PriorityQueue with a custom comparator
        PriorityQueue<Task> taskQueue = new PriorityQueue<>(new Comparator<Task>() {
            @Override
            public int compare(Task task1, Task task2) {
                return Integer.compare(task2.getPriority(), task1.getPriority());
            }
        });

        // Add tasks to the queue
        taskQueue.add(new Task(3, "High Priority Task"));
        taskQueue.add(new Task(1, "Top Priority Task"));
        taskQueue.add(new Task(2, "Medium Priority Task"));

        // Poll and print tasks from the queue
        while (!taskQueue.isEmpty()) {
            Task task = taskQueue.poll();
            System.out.println("Priority: " + task.getPriority() + ", Description: " + task.getDescription());
        }
    }
}
