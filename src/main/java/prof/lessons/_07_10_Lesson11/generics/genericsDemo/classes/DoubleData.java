package prof.lessons._07_10_Lesson11.generics.genericsDemo.classes;

public class DoubleData
{
    private Double number;

    public DoubleData(Double number) {
        this.number = number;
    }

    public Double getNumber() {
        return number;
    }
    public void printNumber(){
        System.out.println("Ваше число "+ number);
    }
}
