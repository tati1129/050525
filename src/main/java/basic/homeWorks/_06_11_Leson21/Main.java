package basic.homeWorks._06_11_Leson21;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Service service = new Service();
        int[] array = service.createArr();
        int[] arrayEven = service.createArrEvenElem();
        double avg = service.createAVG();

        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(arrayEven));
        System.out.println(avg);
    }


}
