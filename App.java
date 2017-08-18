/**
 * Class representing the TodoApp application.
 * It is the main entry point for this program.
 */
import java.util.Scanner;

public class App{

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String option;

        TodoList taskList = new TodoList();

        while (true){
            clearScreen();
            printMenu();
            option = input.nextLine().trim();

            if (option.equals("list"))
                System.out.print(taskList);

            else if (option.equals("add"))
                addTaskApp(taskList);

            else if (option.equals("mark"))
                markTaskApp(taskList);

            else if (option.equals("archive"))
                taskList.archiveDoneTasks();

            else if (option.equals("exit"))
                System.exit(0);

            else
                System.out.print("Wrong input");

            printContinueButton();

        }


  }

    public static void printMenu(){
        System.out.print("Please specify a command [list, add, mark, archive, exit]: ");
  }


    public static void addTaskApp(TodoList taskList){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter new task name: ");
        String taskName = input.nextLine().trim();

        TodoItem newTask = new TodoItem(taskName, false);
        taskList.addTask(newTask);
    }

    public static void markTaskApp(TodoList taskList){
        System.out.print(taskList);
        Scanner input = new Scanner(System.in);
        System.out.print("Enter task to mark: ");
        String taskName = input.nextLine().trim();

        taskList.markTaskInList(taskName);
    }

    public static void clearScreen(){
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static void printContinueButton(){
        Scanner continueButton = new Scanner(System.in);
        System.out.println("\nPress enter to continue...");
        continueButton.nextLine();
    }




}
