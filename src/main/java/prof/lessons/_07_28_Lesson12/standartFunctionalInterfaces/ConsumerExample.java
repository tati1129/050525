package prof.lessons._07_28_Lesson12.standartFunctionalInterfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();

        integers.add(2);
        integers.add(3);
        integers.add(4);

        System.out.println(integers);

        // нам надо создать коллекцию квадратов этих чисел

        // ------ БЕЗ ЛЯМБД и ФИ -----

        List<Integer> squares = new ArrayList<>();

        for (int i = 0; i < integers.size(); i++) {
            int currentInt = integers.get(i) *integers.get(i);
            squares.add(currentInt);
        }

        System.out.println();


        for (Integer elem :squares){
            System.out.println(elem+ ", ");
        }

        System.out.println();
        // ------- то же самое, но через Consumer -----

        Consumer<Integer> getSquareAnrPrint = element -> {
            System.out.println(element * element);
        };

        for (Integer currentElem : integers){
            getSquareAnrPrint.accept(currentElem);
        }

        // ------ более сложный пример Consumer ------

        Consumer<List<Integer>> makeSquareList =  list ->{
            list.replaceAll(element -> element*element);
            list.forEach(integer -> System.out.println(integer + ", "));
        };

        makeSquareList.accept(integers);
    }
}
