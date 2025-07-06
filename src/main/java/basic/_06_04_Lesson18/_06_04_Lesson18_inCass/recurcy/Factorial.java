package basic._06_04_Lesson18._06_04_Lesson18_inCass.recurcy;

public class Factorial {
    int getFuctorial(int n) {
        if (n == 0) return 1;
        return n * getFuctorial(n - 1);
    }
}
