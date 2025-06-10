package basic._06_04_Lesson18._06_04_Lesson18_inCass.pract.loto;

import basic._06_04_Lesson18._06_04_Lesson18_inCass.UserInputStatic;

import java.util.Random;

public class SourceTicketNumbers {
   private Random random = new Random();

    //Метод будет возвращать очередной номер для заполнения нашего билета
    public int receiveTicketNumber(boolean isRandom, int sizeLotteryNumbers, int idTicket, int currentIndex){
        if (isRandom){
            return receiveFromRandom(sizeLotteryNumbers);
        }else {
            return receiveFromUserInput(idTicket,currentIndex);
        }
    }

    private int  receiveFromUserInput(int idTicket, int currentIndex) {
        return UserInputStatic.inputInt("Введите для билета " + idTicket + "значение для числа номер " +currentIndex);

    }

    private int receiveFromRandom(int sizeLotteryNumbers) {
        return random.nextInt(sizeLotteryNumbers+1) +1;
    }
}
