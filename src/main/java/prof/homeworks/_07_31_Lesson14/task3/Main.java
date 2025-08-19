package prof.homeworks._07_31_Lesson14.task3;
/*
  коллекция String - получить строку содержащую все элементы этой коллекции
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        String[] str = {"Java", "Stream", "Filter", "Lambda", "Object", "Class", "Method", "Array", "List", "Map"};
        List<String> strings = new ArrayList<>(Arrays.asList(str));

        System.out.println(getTotalStrings1(strings));
        System.out.println(getTotalStrings2(strings));
        System.out.println(getTotalStrings3(strings));

    }
    public static String getTotalStrings1(List<String> strings){
        StringBuilder sb = new StringBuilder();
        strings.stream()
                .forEach(str -> sb.append(str));
        return sb.toString();
    }

    public static String getTotalStrings2(List<String> strings){
        return  strings.stream()
                .reduce("", (a,b) -> a+b);
    }

    public static String getTotalStrings3(List<String> strings){
       return strings.stream()
                .collect(Collectors.joining());
    }
}
