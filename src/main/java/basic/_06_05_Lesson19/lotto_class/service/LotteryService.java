package basic._06_05_Lesson19.lotto_class.service;

import basic._06_05_Lesson19.lotto_class.LotteryConfiguration;
import basic._06_05_Lesson19.lotto_class.entity.Player;
import basic._06_05_Lesson19.lotto_class.entity.Ticket;
import basic._06_05_Lesson19.lotto_class.repository.LotteryRepository;
import basic._06_05_Lesson19.lotto_class.repository.PlayerRepository;
import basic._06_05_Lesson19.lotto_class.repository.TicketRepository;

public class LotteryService {
    private PlayerRepository playerRepository;
    private TicketRepository ticketRepository;
    private LotteryRepository lotteryRepository;

    public  boolean registerPlayer(String name){

        // могли бы провести проверку соответствия имени неким критериям
        // например: имя не пустое, имя содержит запрещенные символы

        Player player = new Player(name);
        boolean isIaved = playerRepository.save(player);
        return  isIaved;
    }

    public void  prepareLottery() { lotteryRepository.makeLottery();}

    public void generateTicketsWithoutPlayers(){
        for (int i = 0; i < LotteryConfiguration.MAX_TICKETS; i++) {
            Ticket ticket = new Ticket();
            ticketRepository.saveTicket(ticket);
        }
    }

    public void printResult(){

    }
}
