package prof.homeworks._08_20_Lesson21.task3;

import static java.lang.Thread.sleep;

public class TaskRunnable implements Runnable{
    @Override
    public void run() {
        for (int i = 10; i > 0 ; i--) {
            System.out.println(i);
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
