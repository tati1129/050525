package _05_26_Lesson13.forLoop;

public class ForDemo3 {
    public static void main(String[] args) {
        int summEven = 0;


        for (int i = 20; i <= 30 ; i++) {
            if (i%2 == 0){
                summEven += i;
            }
        }
        System.out.println("Сумма всех четных чисел от 20 до 30 : " + summEven);

        int summEven1 = 0;
        for (int i = 20; i <= 30 ; i += 2) {
                summEven1 += i;
        }
        System.out.println("Сумма всех четных чисел от 20 до 30 : " + summEven1);
    }
}
