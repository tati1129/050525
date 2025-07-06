package basic._06_05_Lesson19.loto_home.service;

import basic._06_05_Lesson19.loto_home.repositiry.LotteryRepository;

public class LotteryService {

    private LotteryRepository service = new LotteryRepository();

    public void prepareLottery() {
        service.makeLottery();
    }

    public void printResults() {

    }
}
