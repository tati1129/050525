package prof.homeworks._08_28_Lesson12;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class Task6 {
    public static void main(String[] args) {
        Integer[] arr1 = {1,2,4,6,7};
        Integer[] arr2 = {111,222,422,633,733};

        List<Integer> listInt1 = new ArrayList<>(Arrays.asList(arr1));

        List<Integer> listInt2 = new ArrayList<>(Arrays.asList(arr2));

        String[] arr3 = {"s,kjygn", "ke", "kwe"};
        String[] arr4 = {"214", "2q35465", "355"};

        List<String> listStr1 = new ArrayList<>(Arrays.asList(arr3));
        List<String> listStr2 = new ArrayList<>(Arrays.asList(arr4));



        BinaryOperator<List> newList = (l1,l2) -> {
            List result = new ArrayList<>(l1);
            result.addAll(l2);
           return result;
        };


        System.out.println(newList.apply(listInt1,listInt2));
        System.out.println(newList.apply(listStr1,listStr2));

    }
}
