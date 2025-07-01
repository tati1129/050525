package prof.lessons._06_30_Lesson6.compareObject.comparator;

import java.util.Comparator;

public class PairComparator implements Comparator<Pair> {
    @Override
    public int compare(Pair obj1, Pair obj2) {
int result = obj1.getOurString().compareTo(obj2.getOurString());
if (result == 0){
    result = obj1.getOurInteger() -obj2.getOurInteger();
}
        return result;
    }
}
