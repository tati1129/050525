package prof.homeworks._08_20_Lesson21.task3;

/*
Цель: попрактиковаться в паузах (sleep) и синхронном завершении.
Описание:
Создайте поток, который делает обратный отсчёт от 10 до 1, печатая каждую цифру с паузой в 1 секунду.
Главный поток должен дождаться окончания отсчёта с помощью join(), а затем вывести "Поехали!".
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {
        Thread th1 = new TaskThread();
        Thread th2 = new Thread(new TaskRunnable());
        th1.start();
        th2.start();

        th1.join();
        th2.join();

        System.out.println("Поехали!");
    }
}
