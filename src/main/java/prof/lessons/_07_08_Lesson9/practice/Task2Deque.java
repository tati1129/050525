package prof.lessons._07_08_Lesson9.practice;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class Task2Deque {
    public static void main(String[] args) {
        /*
        Задача на имитацию работы сервера, который получает запросы
        и обрабатывает их в порядке поступления.

        Вариант №1: ArrayList, LinkedList с добавлением нового "запроса"
        в конец списка.

        "Обработка" запроса сводится к "извлечению" из коллекции
        жлемента с индексом 0 -> это приводит к тому, что
        все оставшиеся элементы будет "сдвигаться"

        Раз так, то LinkedList будет эффективнее, чем ArrayList.
         */

        Deque<String> requests = new ArrayDeque<>();

        requests.offer("Request # 1");
        requests.offer("Request # 2");
        requests.offer("Request # 3");


        requestProcessing(requests);
        requestProcessing(requests);

        requests.offer("Request # 4");

        requestProcessing(requests);
        requests.offer("Request # 5");

        requestProcessing(requests);




     }
     public  static void requestProcessing(Deque<String> request){
         System.out.println("Список запросов перед обработкой: " + request);
         String currentRequest = request.poll();
         System.out.println("обработан запрос: " + currentRequest);

         System.out.println("Список запросов после обработки очердного запроса: " + request);

     }
}
