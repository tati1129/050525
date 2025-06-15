package basic.summary._06_06.back.service;

import basic.summary._06_06.back.repositiry.LotteryRepository;

public class LotteryService {

    private LotteryRepository lotteryRepository;

    public LotteryService(LotteryRepository lotteryRepository) {
        this.lotteryRepository = lotteryRepository;
    }

    public void  prepareLottery(){
       lotteryRepository.makeLottery();
    }

public int[] returnWinnerNumber(){
        return  lotteryRepository.getWinningNumbers();
}


}
