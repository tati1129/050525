package _05_13_Lesson6.methodExample;

public class NewCalculator {
    double result;

    public void summ(double x, double y){
        result = y+x;
    }
    public void printResult(){
        System.out.println("Result = " + result);
    }
}
