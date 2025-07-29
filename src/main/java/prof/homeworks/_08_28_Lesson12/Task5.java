package prof.homeworks._08_28_Lesson12;

import java.util.function.Predicate;

public class Task5 {
    public static void main(String[] args) {

        Predicate<Integer> isSimple = n ->{
            if (n <=1)  return false;
            if (n == 2) return true;
            for (int i = 2; i <= Math.sqrt(n) ; i++) {
                if (n % i == 0) return false;
            }
            return true;
        };


        System.out.println(isSimple.test(2));
        System.out.println(isSimple.test(3));
        System.out.println(isSimple.test(7));
        System.out.println(isSimple.test(1));
    }
}
