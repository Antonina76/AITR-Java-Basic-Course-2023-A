package todoV2.model;

import java.util.Objects;

public class Task implements Comparable<Task>{

private int taskId;
private String task;
private static int  nextId;

//constructor


    public Task(String task) {
        this.taskId = nextId++;
        this.task = task;
    }
    //getter and setter


    public int getTaskId() {
        return taskId;
    }

    public void setTaskId(int taskId) {
        this.taskId = taskId;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    @Override
    public String toString() {
        return "Task{" + "taskId=" + taskId + ", task='" + task + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Task task1 = (Task) o;
        return taskId == task1.taskId && Objects.equals(task, task1.task);
    }

    @Override
    public int hashCode() {
        return Objects.hash(taskId, task);
    }

    @Override
    public int compareTo(Task o) {
        return 0;
    }

}
