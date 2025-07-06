package prof.homeworks.lesson.task2;

import prof.homeworks.UserInputStatic;

public class StudentsRepository {
    private Student[] students;
    private int capacity = 50;

    public StudentsRepository() {
        this.students = new Student[capacity];

    }

    public Student createStudentFromUser() {
        String firstName = UserInputStatic.inputText("Введите имя студента");
        String lastName = UserInputStatic.inputText("Введите фамилию студента");
        int age = UserInputStatic.inputInt("Введите возраст студента");

        return new Student(firstName, lastName, age);

    }

    public Student[] addStudent() {
        int quantity = UserInputStatic.inputInt("Сколько студентов вы хотите добавить");
        Student[] result = new Student[quantity];
        if (quantity < capacity) {
            for (int i = 0; i < quantity; i++) {
                result[i] = createStudentFromUser();
            }
        }
        return result;
    }
}
