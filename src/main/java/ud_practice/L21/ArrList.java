package ud_practice.L21;

import java.util.ArrayList;
import java.util.Collections;


public class ArrList {
    public static void main(String[] args) {

        ArrayList<String> newList = new ArrayList<>(abc("Mad", "Mad", "Sad", "Link", "antony", "Carrot", "Water", "Earth"));
        System.out.println(newList);
    }

    public static ArrayList<String> abc(String... strings) {
        ArrayList<String> strList = new ArrayList<>();


        for (String s : strings) {
            if (!strList.contains(s)) {
                strList.add(s);
                System.out.println(s);
            }
        }
        Collections.sort(strList);
        return strList;

    }
}
