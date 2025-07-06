package basic.homeWorks._05_22_Lesson12.task3.var1;

import basic.homeWorks._05_22_Lesson12.UserInputStatic;

public class TaskVar1 {
    public static void main(String[] args) {
        int inputInt = UserInputStatic.inputInt("Введите число от 1 до 7");


        switch (inputInt) {
            case 1:
                System.out.println("Понедельник");
                break;
            case 2:
                System.out.println("Вторник");
                break;
            case 3:
                System.out.println("Среда");
                break;
            case 4:
                System.out.println("Четверг");
                break;
            case 5:
                System.out.println("Пятница");
                break;
            case 6:
                System.out.println("Суббота");
                break;
            case 7:
                System.out.println("Воскресенье");
                break;
            default:
                System.out.println("Вы ввели некорректный ответ");
                String inputString = UserInputStatic.inputText("Повторите ввод :");
                System.out.println("Вы повторили: " + inputString);
        }
    }
}
