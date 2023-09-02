package lab.Assignment;

import java.util.*;

public class TaskManager {
    public static void main(String[] args) {
        List<String> tasks = new ArrayList<>();
        Set<String> completedTasks = new HashSet<>();

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Add Task");
            System.out.println("2. Mark Task as Completed");
            System.out.println("3. List Tasks");
            System.out.println("4. List Completed Tasks");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter task description: ");
                    String task = scanner.nextLine();
                    tasks.add(task);
                    System.out.println("Task added.");
                    break;
                case 2:
                    System.out.print("Enter task description to mark as completed: ");
                    String completedTask = scanner.nextLine();
                    if (tasks.contains(completedTask)) {
                        tasks.remove(completedTask);
                        completedTasks.add(completedTask);
                        System.out.println("Task marked as completed.");
                    } else {
                        System.out.println("Task not found.");
                    }
                    break;
                case 3:
                    System.out.println("Current Tasks:");
                    for (String t : tasks) {
                        System.out.println("- " + t);
                    }
                    break;
                case 4:
                    System.out.println("Completed Tasks:");
                    for (String t : completedTasks) {
                        System.out.println("- " + t);
                    }
                    break;
                case 5:
                    System.out.println("Exiting the Task Manager.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please select a valid option.");
            }

            System.out.println();
        }
    }
}
