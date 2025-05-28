package _05_21_Lesson12.practice;

public class ProductArea {
    public static void main(String[] args) {


        String textRusult = "";
        int x = 10;
        if (x % 2 == 0){
            textRusult = "четное";

        }else {
            textRusult = "нечетное";
        }
        System.out.println("Число " + x + " - " +textRusult);
    }

}
