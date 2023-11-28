import java.util.Scanner;

public class TaskSchedulerMain {
    public static void main(String[] args) {
        TaskScheduler taskScheduler = new TaskScheduler(); // Create an instance of TaskScheduler
        Scanner userInput = new Scanner(System.in);

        // Menu for Task Scheduler
        while (true) {
            System.out.println("\nTask Scheduler Menu:");
            System.out.println("1. Add Task");
            System.out.println("2. View Tasks");
            System.out.println("3. Delete Task");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            int choice = userInput.nextInt(); // Read user input as an integer

            // Process user choice and call the appropriate method
            switch (choice) {
                case 1: // For Add task
                    taskScheduler.addTask();
                    break;
                case 2: // For View task
                    taskScheduler.viewTasks();
                    break;
                case 3: // For Delete task
                    taskScheduler.deleteTask();
                    break;
                case 4: // For Exit
                    System.out.println("Exiting Task Scheduler. Goodbye!");
                    System.exit(0);
                    break;
                default: // For Invalid choice
                    System.out.println("Invalid choice. Please enter a number between 1 and 4.");
            }
        }
    }
}
