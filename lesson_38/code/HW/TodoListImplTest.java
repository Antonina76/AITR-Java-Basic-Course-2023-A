package HW;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import practice.array_methods.ArrayTools;

import static org.junit.jupiter.api.Assertions.*;

class TodoListImplTest {

    Task []tasks;
    TodoListImpl todoList;

    @BeforeEach
    void setUp() {
        todoList = new TodoListImpl(10);
        tasks = new Task[5];
        tasks[0]= new Task("Milk");
        tasks[1]= new Task("Bred");
        tasks[2]= new Task("Butter");
       for (int i = 0; i < tasks.length; i++) {
            todoList.addTask(tasks[i]);
        }
    }

    @Test
    void addTask() {
      System.out.println(todoList.quantity());
      Task task = new Task("Mango");
      assertTrue(todoList.addTask(task));
        System.out.println(todoList.quantity());



    }

    @Test
    void removeTask() {
        System.out.println(todoList.quantity());
        todoList.printTasks();
        assertEquals(tasks[1],todoList.removeTask(2));
        System.out.println(todoList.quantity());
        todoList.printTasks();
    }

    @Test
    void findTask() {
        assertEquals(tasks[2],todoList.findTask(3));
    }


    @Test
    void quantity() {
        assertEquals(3,todoList.quantity());
    }
}