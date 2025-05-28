package basic.homeWorks._05_22_Lesson12.task5;

import basic.homeWorks._05_22_Lesson12.UserInputStatic;

public class Nummer {
    public static void main(String[] args) {
        String inputText = UserInputStatic.inputText("Введите 4х значное число :");

        ishappyDigits(inputText);

    }

    public static boolean isInteger(String input) {
        if (input == null || input.isEmpty() || (input.length() != 4)) {
            System.out.println("Ошибка! не корректный ввод!");
            return false;
        }
        for (int i = 0; i < input.length(); i++) {
            if (!Character.isDigit(input.charAt(i))) {
                System.out.println("Ошибка! Введено не 4х значное число!");
                return false;
            }
        }
        return true;

    }

    public static boolean ishappyDigits(String input) {
        if (!isInteger(input)) {
            return false;
        }

        int happyNummer;
        int[] num = new int[4];
        for (int i = 0; i < input.length(); i++) {
            //num[i] = input.charAt(i) - '0';  // преобразуем символ в число
            num[i] = Character.getNumericValue(input.charAt(i)); // преобразуем символ в число
        }
        if ((num[0] + num[1]) == (num[2] + num[3])) {
            happyNummer = (num[0] + num[1]);
            System.out.println("Число " + happyNummer + " является счастливым!");
            return true;
        } else {
            System.out.println("Число не является счастливым!");
            return false;
        }
    }
}
