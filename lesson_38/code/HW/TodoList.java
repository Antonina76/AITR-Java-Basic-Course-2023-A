package HW;

public interface TodoList {

    boolean addTask (Task task);
    Task removeTask(int id);
    Task findTask (int id);
    void printTasks();
    int quantity ();

}
