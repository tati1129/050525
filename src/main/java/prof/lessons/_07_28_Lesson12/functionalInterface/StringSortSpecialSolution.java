package prof.lessons._07_28_Lesson12.functionalInterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StringSortSpecialSolution {
    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();
        myList.add("FF");
        myList.add("ssd");
        myList.add("s");
        myList.add("AA");
        myList.add("wwwF");
        myList.add("HXS");

        System.out.println(myList);

//        Collections.sort(myList);

//        Comparator<String> myComparator = new Comparator<String>() {
//            @Override
//            public int compare(String str1, String str2) {
//                return str1.length()-str2.length();
//            }
//        };
//
//        System.out.println(myComparator);
//
//        Collections.sort(myList, myComparator);
//
//        System.out.println(myList);





//        Comparator<String> myComparator =
//                (String str1, String str2) -> {
//                    return str1.length() - str2.length();
//                };
//
//        Collections.sort(myList, myComparator);
//        System.out.println(myList);


//        Comparator<String> myComparator = (String str1, String str2) -> str1.length() - str2.length();
//
//        Collections.sort(myList, myComparator);
//        System.out.println(myList);



        Collections.sort(myList, ((String str1, String str2) -> str1.length() - str2.length()));

        System.out.println(myList);Collections.sort(myList, ((String str1, String str2) -> str2.length() - str1.length()));

        System.out.println(myList);
    }
}
