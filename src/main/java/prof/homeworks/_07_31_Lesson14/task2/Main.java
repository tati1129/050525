package prof.homeworks._07_31_Lesson14.task2;
/*
 коллекция String  - получить коллекцию элементов у которых нечетное количество символов
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String[] str = {"Java", "Stream", "Filter", "Lambda", "Object", "Class", "Method", "Array", "List", "Map"};
        List<String> strings = new ArrayList<>(Arrays.asList(str));

        System.out.println(filteredEvenStrSize(strings));

    }
    public static List<String> filteredEvenStrSize(List<String> strings){
        List<String> filtered = strings.stream()
                .filter(str -> (str.length()%2==0))
                .toList();
        return filtered;
    }
}
