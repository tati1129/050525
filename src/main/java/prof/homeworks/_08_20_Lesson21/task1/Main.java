package prof.homeworks._08_20_Lesson21.task1;
/*
Описание:
Создайте программу, которая запускает два потока.
Первый поток должен выводить на экран 5 раз "Привет из потока 1".
Второй поток должен выводить на экран 5 раз "Привет из потока 2".
Сделайте один поток через наследование от Thread, а второй — через реализацию интерфейса Runnable.
 */

public class Main {
    public static void main(String[] args) {

        Thread thread1 = new ExampleThread();
        Thread thread2 = new Thread(new ExampleRunnable());

        thread1.start();
        thread2.start();

    }
}
