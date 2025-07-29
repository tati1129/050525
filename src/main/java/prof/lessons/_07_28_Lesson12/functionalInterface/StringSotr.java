package prof.lessons._07_28_Lesson12.functionalInterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StringSotr {
    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();
        myList.add("FF");
        myList.add("ssd");
        myList.add("s");
        myList.add("AA");
        myList.add("wwwF");
        myList.add("HXS");

        System.out.println(myList);

        Collections.sort(myList);

        System.out.println(myList);

        Collections.sort(myList, new StringLengthComparator());

        System.out.println(myList);
    }
}
