import java.text.SimpleDateFormat;
import java.util.*;

class TaskScheduler {
    private final ArrayList<Task> tasks = new ArrayList<>(); // List of tasks to be scheduled
    private final Scanner scanner = new Scanner(System.in);

    public void addTask() { // Add a new task to the list of tasks
        System.out.print("Enter task name: ");
        String name = scanner.nextLine();

        System.out.print("Enter due date (yyyy-MM-dd): ");
        String dueDateString = scanner.nextLine();
        Date dueDate = parseDate(dueDateString); // Parse the due date as a Date object

        System.out.print("Enter priority (1-5, where 5 is highest): ");
        int priority = scanner.nextInt();

        // Create a new Task object and add it to the list of tasks
        Task newTask = new Task(name, dueDate, priority);
        tasks.add(newTask); // Add the new task to the list

        System.out.println("Task added successfully!");
    }

    public void viewTasks() { // View all tasks in the list of tasks

        // If there are no tasks, print a message
        if (tasks.isEmpty()) {
            System.out.println("No tasks available.");
        } else { // If there are tasks, sort them by due date and print them
            tasks.sort(Comparator.comparing(Task::dueDate));

            System.out.println("Tasks:");

            // Iterate through the list of tasks
            for (Task task : tasks) {
                System.out.println(task); // Print each task
            }
        }
    }

    public void deleteTask() { // Delete a task from the list of tasks
        viewTasks(); // View all tasks in the list

        // If there are no tasks, print a message
        if (tasks.isEmpty()) {
            return; // Do nothing
        }

        System.out.print("Enter the index of the task to delete: ");
        int index = scanner.nextInt();

        // If the index is valid, remove the task from the list
        if (index >= 0 && index < tasks.size()) {
            tasks.remove(index); // Remove the task from the list
            System.out.println("Task deleted successfully!");
        } else {
            System.out.println("Invalid index.");
        }
    }

    // Helper method to parse the due date as a Date object
    private Date parseDate(String dateString) {
        try {
            // Parse the due date as a Date object and return it
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            return dateFormat.parse(dateString); // Parse the due date as a Date object
        } catch (Exception e) {
            System.out.println("Invalid date format. Please use yyyy-MM-dd.");
            return null;
        }
    }
}