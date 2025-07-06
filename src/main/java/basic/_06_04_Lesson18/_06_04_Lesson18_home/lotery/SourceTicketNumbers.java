package basic._06_04_Lesson18._06_04_Lesson18_home.lotery;

import basic._06_04_Lesson18._06_04_Lesson18_home.UserInputStatic;

import java.util.Random;
/*
 * int idTicket -  № билета
 * int currentIndex - № числа
 */

public class SourceTicketNumbers {
    Random random = new Random();

    public int receiveTicketNumber(boolean isRandom, int sizeLotteryNumber, int idTicket, int currentIndex) {
        if (isRandom) {
            return receiveFromRandom(sizeLotteryNumber);
        } else {
            return reciveFromUserTicket(idTicket, currentIndex);
        }

    }

    private int reciveFromUserTicket(int idTicket, int currentIndex) {
        return UserInputStatic.inputInt("Введите для билета № " + idTicket + " значение числа № " + currentIndex + " : ");
    }

    private int receiveFromRandom(int sizeLotteryNumber) {
        return random.nextInt(sizeLotteryNumber) + 1;
    }
}
