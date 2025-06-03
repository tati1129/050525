package basic._05_26_Lesson13.practics;

import basic._05_26_Lesson13.UserInputStatic;

public class Task2 {
    public static void main(String[] args) {
//        запросите у пользователя количество чисел, которые он будет вводить
//
//        запросите у него каждое число и в зависимости от того что он ввел
//                - если число отрицательное нечетное то выведете сообщение "ОШИБКА                 ввода данных"
//                - в противном случае просто напечатайте это число

        int num;
        boolean condition = true;

        while (condition){
            num = UserInputStatic.inputInt("Введите целое четное положительное число");
            if ((num>0) &&( num %2 == 0)){
                System.out.println("Вы ввели целое четное положительное число" + num);
            }else {
                System.out.println( "ОШИБКА ввода данных");
                break;
            }
        }
    }
}
