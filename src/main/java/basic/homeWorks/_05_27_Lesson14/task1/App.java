package basic.homeWorks._05_27_Lesson14.task1;


/*
 уровень сложности: 1. Напишите программу, перемножающую чётные числа, которые вводит пользователь. Программа должна перемножить любое
   количество чётных чисел, которое введёт пользователь. Ввод должен быть остановлен, если пользователь введёт ноль,
   после этого должен быть отображён на экране результат умножения.
 */
public class App {
    public static void main(String[] args) {
        int multi = 1;
        int numEven;

        while (true) {
            int num = UserInputStatic.inputInt("Введите число для умножения. Умножаться будут четные числа. В случае ввода 0 - выход из программы. ");
            if (num == 0) {
                System.out.println("Сеанс окончен!");
                break;
            }
            if (num % 2 == 0) {

                multi *= num;
                System.out.println("Результат умножения чётных чисел: " + multi);
            }
        }
        System.out.println("Результат умножения чётных чисел: " + multi);


    }
}
