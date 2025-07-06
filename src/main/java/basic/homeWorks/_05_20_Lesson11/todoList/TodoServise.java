package basic.homeWorks._05_20_Lesson11.todoList;


import basic.homeWorks._05_20_Lesson11.UserInput;

public class TodoServise {

    public Day createDay() {
        UserInput input = new UserInput();

        int numberOfDay = input.inputInt("Введите номер дня, где : MONDAY -1, TUESDAY - 2, WEDNESDAY - 3, THURSDAY - 4, FRIDAY - 5, SATURDAY - 6, SUNDAY - 7");
        if (numberOfDay >= 1 && numberOfDay <= 7) {
            Day selectedDay = Day.values()[numberOfDay - 1]; // индексы начинаются с 0
            System.out.println("Вы выбрали: " + selectedDay);
            return selectedDay;
        } else {
            System.out.println("Неверный номер дня. Введите число от 1 до 7.");
            return null;
        }

    }

    public Task createTask(DayOfWeek dayOfWeek) {
        UserInput input = new UserInput();

        String taskInfo = input.inputText("Введите информацию о задаче : ");
//        DayOfWeek dayOfWeek = new DayOfWeek(day.name());// Преобразование Day в DayOfWeek
        Task newTask = new Task(taskInfo, dayOfWeek);
        dayOfWeek.addTask(newTask); // Добавляем задачу к конкретному дню
        return newTask;
    }

    public void createTaskForDay() {
        Day day = createDay();
        if (day != null) {
            DayOfWeek dayOfWeek = new DayOfWeek(day.name()); // Создаем DayOfWeek из Day
            String anotherTask = "y";
            while (anotherTask.equalsIgnoreCase("y")) {
                createTask(dayOfWeek);
                UserInput input = new UserInput();
                anotherTask = input.inputText("Хотите добавить еще задачу для этого дня? (y/n): ");
            }
            dayOfWeek.printTasks(); // печатаем задачи после ввода

        }
    }
}
