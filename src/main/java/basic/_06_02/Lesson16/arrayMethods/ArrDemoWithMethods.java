package basic._06_02.Lesson16.arrayMethods;

import basic._06_02.Lesson16.UserInputStatic;

public class ArrDemoWithMethods {
    public static void main(String[] args) {
        ArrayService service = new ArrayService();

        int size = UserInputStatic.inputInt("Введите длину массива");
        int startValue = UserInputStatic.inputInt("Введите начало диапазона массива");
        int endValue = UserInputStatic.inputInt("Введите конец диапазона массива");
        int[] array = service.createArr(size);
//        service.fillArrByRandom(startValue,endValue,array);
//        service.printArr(array);


        int[] arrUser = service.fillArrByUser();
        service.printArr(arrUser);


    }
}
