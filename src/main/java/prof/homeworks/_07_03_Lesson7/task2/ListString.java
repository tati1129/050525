package prof.homeworks._07_03_Lesson7.task2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class ListString {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("apple", "banana", "kiwi", "pear", "pineapple", "plum"));


        Character chOld = 'a';
        Character chNew = '…';
        System.out.println("До замены: " + list);
      replaseElement(list, chOld, chNew);

        System.out.println("После замены: " + list);
    }

    public static List<String> replaseElement(List<String> strings, Character charOld, Character charNew) {
        ListIterator<String> listIterator = strings.listIterator();
        while (listIterator.hasNext()) {
            String current = listIterator.next();
            String replaced = current.replace(charOld,charNew);

            listIterator.set(replaced);
        }
        return strings;
    }
}
