/**
 * Class representing a todo list.
 * TodoList object should aggregate TodoItem objects.
 */
import java.util.ArrayList;

public class TodoList{

    private ArrayList<TodoItem> taskList;

    public TodoList() {

        taskList = new ArrayList<TodoItem>();

    }

    public static void main(String[] args) {

    }

    public void addTask(TodoItem task){
        taskList.add(task);

    }

    public String toString() {
        String toString = "";
        int counter = 1;

        for (TodoItem task : taskList) {
            toString += counter + ". " +  task.toString() +"\n";
            counter++;
        }
        return toString;
    }

    public void archiveDoneTasks(){
        for (int i = 0; i < taskList.size(); i++){
            TodoItem task = taskList.get(i);
            if (task.getIsDone() == true);
                taskList.remove(i);
        }

    }

    public void markTaskInList(String taskName){
        for (TodoItem task : taskList) {
            if (task.getTaskName().equals(taskName))
                task.markTask();

            else
                System.out.println("Wrong task name.");
        }

    }


}
