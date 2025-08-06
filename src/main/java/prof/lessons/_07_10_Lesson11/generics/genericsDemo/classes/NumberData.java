package prof.lessons._07_10_Lesson11.generics.genericsDemo.classes;

public class NumberData <N>{
    private N number;

    public NumberData(N number) {
        this.number = number;
    }
    public void printNumber(){
        System.out.println("Ваше число "+ number);
    }
}
