package basic.homeWorks._05_20_Lesson11.todoList;

public class DayOfWeek {
    private String day;
    private Task[] tasks;
    private int taskCount;


    public DayOfWeek(String day) {
        this.day = day;
        this.tasks = new Task[10];
        this.taskCount = 0;
    }


    public void addTask(Task task) {
        if (taskCount < tasks.length){
            tasks[taskCount] = task;
            taskCount++;
        }else {
            System.out.println("Нельзя добавить больше задач в жтот день");
        }
    }

    public void printTasks(){
        System.out.println(day + " : ");
        for (int i = 0; i < taskCount ; i++) {
            System.out.println(" - " + tasks[i]);
        }
    }

    @Override
    public String toString() {
        return day
                ;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof DayOfWeek) {
            //если nameOfTheDay текущего объекта равен переданному объекту тогда оны равны
            if (this.day.equals(((DayOfWeek) obj).day)) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }


    }

}
