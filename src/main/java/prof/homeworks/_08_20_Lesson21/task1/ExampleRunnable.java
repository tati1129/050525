package prof.homeworks._08_20_Lesson21.task1;

public class ExampleRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Привет из потока 2");
        }
    }
}
