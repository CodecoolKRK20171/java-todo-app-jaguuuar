/**
 * Class representing a single todo item.
 *
 */
public class TodoItem {

    private String taskName;
    private boolean isDone;


    public TodoItem(String name, boolean isDone) {
        taskName = name;
        isDone = false;
    }

    public boolean getIsDone(){
        return isDone;
    }

    public String getTaskName(){
        return taskName;
    }

    public static void main(String[] args) {
    }

    public String toString() {
        String toString;
        if (isDone)
            toString = "[x] " + taskName;

        else
            toString = "[ ] " + taskName;

        return toString;
    }

    public void markTask() {
        isDone = true;
    }
}
