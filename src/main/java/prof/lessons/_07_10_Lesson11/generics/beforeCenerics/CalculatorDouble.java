package prof.lessons._07_10_Lesson11.generics.beforeCenerics;

public class CalculatorDouble {
   double x;
   double y;

    public CalculatorDouble(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void sum(){
       System.out.println(x+y);
   }
}
