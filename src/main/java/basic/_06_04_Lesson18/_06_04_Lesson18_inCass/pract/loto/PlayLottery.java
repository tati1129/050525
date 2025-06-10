package basic._06_04_Lesson18._06_04_Lesson18_inCass.pract.loto;

import basic._06_04_Lesson18._06_04_Lesson18_inCass.UserInputStatic;

public class PlayLottery {
    public static void main(String[] args) {

        // создаем константы для нашей лотереи:
        //- количество выигрышных номеров (размер билета)
        //- размер лотереи

        int lotterySize = 36;
        int winnerSize = 5;

// создаем игрока с определенным количеством билетов
        int quantityPlayerTickets = UserInputStatic.inputInt("Сколько билетов желаете купить? ");

        Player player = new Player("123-456-678", quantityPlayerTickets);

        /*
        после выполнения кода из 20 строки в памяти jvm будут присутствовать следующие элементы:
        1) Player player
        2) будет создан массив для хранения экземпляров класса LotteryTicket[] tickets
        3) в каждой ячейки это массива будет хранится ссылка на объект LotteryTicket
        4) в каждом объекте LotteryTicket у нас есть массив для хранения значений номеров - объект

         */

        // в игроке мы создаем билеты (а в каждом билете заполняем данные о его номерах)
        boolean isRandom = UserInputStatic.inputBoolean("Вы хотите купить билеты с готовыми числами? (true / false)");

        player.fillTickets(winnerSize,lotterySize,isRandom);

        player.printPlayerData();


        // подготовим проведение лотереи

        // создание экземпляра класса Lottery в котором все методы
        Lottery lottery = new Lottery();

        // создать и заполнить массив со всеми лотерейными номерами

        lottery.createLotteryNumbers(lotterySize);

        // провести лотерею

        lottery.lotteryRound(winnerSize);

        lottery.printWinnerNumbers();


    }
}
