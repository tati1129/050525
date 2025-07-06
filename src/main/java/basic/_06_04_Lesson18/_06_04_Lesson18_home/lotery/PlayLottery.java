package basic._06_04_Lesson18._06_04_Lesson18_home.lotery;

import basic._06_04_Lesson18._06_04_Lesson18_home.UserInputStatic;

public class PlayLottery {
    public static void main(String[] args) {
        int lotterySize = 36;
        int winnerSize = 5;


        int quantityPlayerTicket = UserInputStatic.inputInt("Введите количество билетов, которое хотите приобрести :");

        Player player = new Player("1122", quantityPlayerTicket);

        boolean isRandom = UserInputStatic.inputBoolean("Вы хотите купить билеты с заполненными числами? (true/false)");

        player.fillTickets(winnerSize, lotterySize, isRandom);
        player.printPlayerData();

        Lottery lottery = new Lottery();

        lottery.createLotteryNumbers(lotterySize);
        lottery.lotteryRound(winnerSize);
        lottery.printWinnersNumbers();
        LotteryResult result = new LotteryResult();

        result.checkLotteryResult(lottery, player);

    }
}
