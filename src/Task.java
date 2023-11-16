import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Record class represents a task with name, due date, and priority information
 * in the form of a string value with the following format:
 * "Task: name, Due Date: dueDate, Priority: priority"
 * where dueDate is in the format "yyyy-MM-dd" and
 * priority is an integer value between 1 and 5.
 * The priority value is used to determine the order of tasks in the list of tasks.
 * The toString() method returns the string representation of the task.
 * The equals() method compares two tasks based on their name and due date.
 */
record Task(String name, Date dueDate, int priority) {

    @Override
    public String toString() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        return "Task: " + name + ", Due Date: " + dateFormat.format(dueDate) + ", Priority: " + priority;
    }
}

/*
class Task {    // This way can be used in Java 8 and above only
    private final String name;
    private final Date dueDate;
    private final int priority;

    public Task(String name, Date dueDate, int priority) {
        this.name = name;
        this.dueDate = dueDate;
        this.priority = priority;
    }

    public String getName() {
        return name;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public int getPriority() {
        return priority;
    }

    @Override
    public String toString() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        return "Task: " + name + ", Due Date: " + dateFormat.format(dueDate) + ", Priority: " + priority;
    }
}*/
