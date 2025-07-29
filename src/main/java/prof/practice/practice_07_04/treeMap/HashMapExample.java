package prof.practice.practice_07_04.treeMap;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();

        map.put(2, "Two");
        map.put(17, "Seventeen");
        map.put(7, "Seven");
        map.put(6, "Six");
        map.put(11, "Eleven");
        map.put(3, "Three");

        System.out.println(map);
    }
}
