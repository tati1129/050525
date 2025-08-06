package prof.lessons._07_10_Lesson11.generics.genericsDemo.classes;

public class NumberDemo {
    public static void main(String[] args) {
        IntegerData integerData = new IntegerData(6);
        DoubleData doubleData = new DoubleData(3.0);
        integerData.printNumber();
        doubleData.printNumber();

        //------- а теперь с использованием generics ------

        NumberData<Integer> integerNumberData = new NumberData<>(7);
        NumberData<Double> doubleNumberData = new NumberData<>(11.5);
        integerData.printNumber();
        doubleData.printNumber();

    }
}