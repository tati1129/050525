package basic._06_04_Lesson18._06_04_Lesson18_inCass.pract.loto;

public class LotteryTicket {
    // массив для хранения номеров билета (мы не говорим какой он будет длины, чтобы иметь
    // возможность создать "универсальный" билет
    // то есть длину массива мы будет определять позже
    private int[] ticketNumbers;


    //Основной метод для создания и заполнения билета
    public void creteAndFillTicket(int size, int sizeLottery, boolean isRandom, int idTicket) {
        ticketNumbers = new int[size];
        fillTicket(sizeLottery, isRandom, idTicket);
    }

    //Метод заполнения билета - передаем из какого диапазона должны быть значения в нем
    //каким образом значения появляются ранодомно или пользователем
    private void fillTicket(int sizeLottery, boolean isRandom, int idTicket) {
        //чтобы заполнить нужен источник значениий
        SourceTicketNumbers source = new SourceTicketNumbers();
        for (int i = 0; i < ticketNumbers.length; i++) {

            boolean isNotFilCurentNumber = true;
            int currentRandomValue = 0;

            while (isNotFilCurentNumber)
                //получаем очередное значение для текущего номера билета
                currentRandomValue = source.receiveTicketNumber(isRandom, sizeLottery, idTicket, i);
            //проверяем, если уже среди ранее введенных номеров такое значение
            //если да, то повторно запрашиваем номер, если нет - сораняем полученное значение в текущую ячейку массива и переходим в следующее
            if (isCurrentNumberIsNotRepeat(currentRandomValue)) {
                ticketNumbers[i] = currentRandomValue;
                isNotFilCurentNumber = false;
            }
        }
    }

    private boolean isCurrentNumberIsNotRepeat(int checkNumber) {
        for (int i = 0; i < ticketNumbers.length; i++) {
            if (ticketNumbers[i] == checkNumber) {
                return false;
            }

        }
        return true;
    }

    public int[] getTicketNumbers() {
        return ticketNumbers;
    }
}
