package todoV2.dao;


import todoV2.model.Task;

import java.io.IOException;

public interface TodoList {

    boolean addTask (Task task);
    Task removeTask(int id);
    Task findTask (int id);
    void printTasks();
    int quantity ();
    void saveTasks() throws IOException;


}
