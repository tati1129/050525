package prof.lessons._07_28_Lesson12.lambda;

public class MyClassWithIAverage implements IAverage{
    @Override
    public double avg(double a, double b) {
        System.out.println("Число a = " + a);
        System.out.println("Число b = " + b);

        return (a + b) / 2;

    }
}
