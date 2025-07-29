package prof.lessons._07_28_Lesson12.lambda;

public class AvgExample2 {

    public static void main(String[] args) {
// вариант 1
        System.out.println("------- Вариант 1 -------");
        MyClassWithIAverage myClassWithIAverage = new MyClassWithIAverage();
        printMyAverage(5,7,myClassWithIAverage);

// вариант 2
        System.out.println("-------- Вариант 2 -------");
        printMyAverage(10,12 ,(double a, double b) -> (a+b)/2);


    // вариант 3
        System.out.println("-------- Вариант 3 -------");
        IAverage ref = (double a, double b) ->{
            double avg = (a +b) / 2;
            avg = avg * avg /Math.sqrt(a);
            return  avg;
        };
        printMyAverage(75,12, ref);

    }
public static void printMyAverage(double a, double b, IAverage reference){
    System.out.println(reference.avg(a,b));
}}
