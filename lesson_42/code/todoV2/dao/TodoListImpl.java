package todoV2.dao;
import todoV2.model.Task;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;


public class TodoListImpl implements TodoList {
    final String OUTPUT = "tasks.txt";
    final String INPUT = "tasks.txt";
    private Task[] tasks;
    private int capacity;
    private int quantity;

    public TodoListImpl(int capacity) {
        this.tasks = new Task[capacity];
        this.quantity = 0;

    }

    @Override
    public boolean addTask(Task task) {
        if(task != null){
            tasks[quantity]= task;
            quantity++;
            return  true;
        }
        return false;
    }



    @Override
    public Task removeTask(int taskId) {
        //find by id then remove
        for (int i = 0; i < quantity; i++) {
            if(tasks[i].getTaskId() == taskId){
                Task removedTask = tasks[i];
                for (int j = 0; j < quantity-1; j++) {
                    tasks[j]= tasks[j+1];
                }
                tasks[quantity-1] = null;
                quantity--;
                //устанавливаем новые индексы
                for (int j = 0; j<quantity; j++){
                    tasks[j].setTaskId(j);
                }
                return removedTask;
            }
        }
        return null;
    }


    @Override
    public Task findTask(int taskId) {
        for (int i = 0; i < quantity; i++) {
            if(tasks[i].getTaskId()==taskId){
                return tasks[i];
            }
        }
        return null;
    }

    @Override
    public void printTasks() {
        for (int i = 0; i < quantity; i++) {
            System.out.println(tasks[i]);
        }
        System.out.println("You have " + quantity + " tasks. ");

    }

    @Override
    public int quantity() {

        return quantity;
    }

    @Override
    public void saveTasks() throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(OUTPUT));
        for (int i = 0; i < quantity; i++) {
            String str = String.valueOf(tasks[i]);//переводим tasks[i] в строку
            bufferedWriter.write(str + "\n");
        }
        bufferedWriter.flush();
    }

}
