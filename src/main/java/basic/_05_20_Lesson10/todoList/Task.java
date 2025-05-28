package basic._05_20_Lesson10.todoList;

public class Task {
    private static int taskCounter = 1; // счётчик для всех задач

    private int task;
    private String taskInfo;
    DayOfWeek day;

    public Task(String taskInfo, DayOfWeek day) {
        this.task = taskCounter++;
        this.taskInfo = taskInfo;
        this.day = day;
    }


    @Override
    public String toString() {
        return "Задача " + task + ": " + taskInfo;
    }
}
