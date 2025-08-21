package prof.homeworks._08_20_Lesson21.task3;

public class TaskThread extends Thread{

    @Override
    public void run() {
        for (int i = 10; i >0 ; i--) {
            System.out.println(i);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
    }
}
