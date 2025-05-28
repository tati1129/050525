package basic._05_27_Lesson14.task1;

public class Main {
    public static void main(String[] args) {
        int counter = 1;

        while (counter<=5){
            System.out.println("counter" + counter);
            counter++;
        }

        counter = 0;
        while (counter<5){
            System.out.println("counter" + counter+1);
            counter++;
        }

        counter = 0;
        while (counter<5){
            System.out.println("counter" + ++counter);
            counter++;
        }

        counter = 1;
        do {
            System.out.println(counter++);
        } while (counter<=5);

    }
}
