package basic._06_04_Lesson18._06_04_Lesson18_home.recurcy;

public class Factorial {
    int getFactorial(int n){
        if (n == 0) return 1;
        int fact =  n * getFactorial(n - 1);
        System.out.println(fact);
        return fact;
    };
}
