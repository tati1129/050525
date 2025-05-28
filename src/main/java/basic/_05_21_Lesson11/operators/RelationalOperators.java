package basic._05_21_Lesson11.operators;

public class RelationalOperators {
    public static void main(String[] args) {
        //реляционные операторы (операторы сравнения) - это набор бинарных операторов, которые используются для проверки отношений между двумя операторами

        int x = 20;
        int y = 15;

        boolean resultEqual = (x == y); //не присваиваем а утверждаем(сравниваем)
        System.out.println(resultEqual);

        boolean resultNotEqual = (x != y);
        System.out.println(resultNotEqual);

        boolean resultGreater = (x > y);
        System.out.println(resultGreater);

        boolean resultLess = (x < y);
        System.out.println(resultLess);

        boolean resultGreaterOrEqual = (x >= y);
        System.out.println(resultGreaterOrEqual);

        boolean resultLessOrEqual = (x <= y);
        System.out.println(resultLessOrEqual);
    }

}
