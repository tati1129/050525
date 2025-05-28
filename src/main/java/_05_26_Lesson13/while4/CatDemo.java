package _05_26_Lesson13.while4;

import javaPro3._05_26.UserInputStatic;
import javaPro3._05_26.while2.Cat;

public class CatDemo {
    public static void main(String[] args) {
          /*
       Для регистрации кошки в журнале попросите ввести ее имя
       если пользователь в имени кошки ввел пустую строку или только пробелы,
       то завершите ввод данных
         */

        int catCounter = 0;

        boolean condition = true;

        while (condition) {

            String catName = UserInputStatic.inputString("Введите имя кошки: ");

            if (catName.isBlank()) {
                condition = false;
            } else {
                Cat cat = new Cat(catName);
                System.out.println("Кошка: " + cat.getName() + " зарегистрирована в журнале");
            }
        }

        System.out.println("Приняли " + catCounter + " кошек. Прием окончен");

    }
}
