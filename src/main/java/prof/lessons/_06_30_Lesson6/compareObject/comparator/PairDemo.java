package prof.lessons._06_30_Lesson6.compareObject.comparator;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class PairDemo {
    public static void main(String[] args) {

        Comparator<Pair> pairComparator = new PairComparator();

        Set<Pair> pairs = new TreeSet<>(pairComparator);


        pairs.add(new Pair("John",1));
        pairs.add(new Pair("Zigmund",11));
        pairs.add(new Pair("Boris",7));
        pairs.add(new Pair("John",46));
        pairs.add(new Pair("Alex",25));
        pairs.add(new Pair("Elena",18));
        pairs.add(new Pair("Bill",91));

        System.out.println(pairs);


    }
}
