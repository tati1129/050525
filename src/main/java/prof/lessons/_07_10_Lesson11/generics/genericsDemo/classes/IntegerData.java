package prof.lessons._07_10_Lesson11.generics.genericsDemo.classes;

public class IntegerData {
    private java.lang.Integer number;

    public IntegerData(java.lang.Integer number) {
        this.number = number;
    }

    public java.lang.Integer getNumber() {
        return number;
    }
    public void printNumber(){
        System.out.println("Ваше число "+ number);
    }
}
