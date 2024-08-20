package com.taskmanagement;

public class Main {
    public static void main(String[] args) {
        TaskManagement taskManagement = new TaskManagement();

        taskManagement.addTask(new Task("T001", "Design UI", "Pending"));
        taskManagement.addTask(new Task("T002", "Develop Backend", "In Progress"));
        taskManagement.addTask(new Task("T003", "Test Application", "Pending"));
        taskManagement.addTask(new Task("T004", "Deploy to Production", "Pending"));

        System.out.println("All Tasks:");
        taskManagement.traverseTasks();

        System.out.println("\nSearching for Task T002:");
        Task foundTask = taskManagement.searchTask("T002");
        if (foundTask != null) {
            System.out.println("Found: " + foundTask);
        } else {
            System.out.println("Task not found.");
        }

        System.out.println("\nDeleting Task T003:");
        taskManagement.deleteTask("T003");

        System.out.println("\nAll Tasks after deletion:");
        taskManagement.traverseTasks();
    }
}