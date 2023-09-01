package todoV2;

import todoV2.model.Task;
import todoV2.dao.TodoListImpl;
import todoV2.model.Menu;
import java.io.IOException;
import java.util.Scanner;

public class TodoListAppl {

    public static void main(String[] args) throws IOException{
        System.out.println("Welcome to the TodoList Application !");
        TodoListImpl todoList = new TodoListImpl(10);
        Scanner scanner = new Scanner(System.in);
        todoList.readTasks();
        todoList.printTasks();
      try {
        while (true) {
            Menu.printMenu();
            System.out.println();
            System.out.println("Please input your choice");
            int choice = scanner.nextInt();
        switch (choice) {
            case 1: {//Add task
                scanner.nextLine();
                System.out.println("Please input your  task: ");
                String task = scanner.nextLine();
                Task task1 = new Task(task);
                todoList.addTask(task1);
                todoList.saveTasks();
                break;
            }
            case 2: {
                System.out.println("Your tasks are: ");
                todoList.printTasks();
                break;
            }
            case 3: {
                System.out.println("Please input your  Id number");
                int id = scanner.nextInt();
                Task removedTask = todoList.removeTask(id - 1);
                System.out.println(removedTask + " is removed");
                todoList.saveTasks();
                break;
            }
            case 4: {
                System.out.println("Please input your  Id number");
                int id = scanner.nextInt();
                Task foundId = todoList.findTask(id - 1);
                System.out.println("Task found " + foundId);
            }
            case 5:
                return;
            default: {
                System.out.println("Wrong input!");
            }
        }
            }//end of switch
        }catch (Exception e){
          System.out.println(e.toString() + " wrong input, try again!");
      }
    }//en of main
}//end of class