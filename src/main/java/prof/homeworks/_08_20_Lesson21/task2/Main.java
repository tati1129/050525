package prof.homeworks._08_20_Lesson21.task2;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        int[] arr = new int[100];
        for (int i = 0; i < 100; i++) {
            arr[i] = i + 1;

        }
        final int[] sum1 = {0};
        final int[] sum2 = {0};


        Thread thread1 = new Thread(() -> {
            int sum = 0;
            for (int i = 0; i < 50; i++) {
                sum += arr[i];
            }
            sum1[0] = sum;
            System.out.println(sum);
        });

        Thread thread2 = new Thread(() -> {
            int sum = 0;
            for (int i = 50;  i < arr.length;  i++) {
                sum += arr[i];
            }
            sum2[0] = sum;
            System.out.println(sum);
        });
        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();
        int sumTotal = sum1[0]+ sum2[0];
        System.out.println("Total is : " + sumTotal );
    }
}
