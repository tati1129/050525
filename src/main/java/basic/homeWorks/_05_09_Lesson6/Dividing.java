package basic.homeWorks._05_09_Lesson6;

public class Dividing {
    int num;

    int divider2 = 2;
    int divider3 = 3;

    public void getDivederBy2() {
        int result = num % divider2;
        System.out.println(" The remainder of dividing the sum " + num + " by 2 is : " + result);
    }

    public void getDivederBy3() {
        int result = num % divider3;
        System.out.println(" The remainder of dividing the sum " + num + " by 3 is : " + result);
    }

}
