package prof.lessons._07_08_Lesson9.practice;

import java.util.LinkedList;
import java.util.List;

public class Task2 {
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

        List<String> requests = new LinkedList<>();

        requests.add("Request # 1");
        requests.add("Request # 2");
        requests.add("Request # 3");


        requestProcessing(requests);
        requestProcessing(requests);

        requests.add("Request # 4");

        requestProcessing(requests);
        requests.add("Request # 5");

        requestProcessing(requests);




     }
     public  static void requestProcessing(List<String> request){
         System.out.println("Список запросов перед обработкой: " + request);
         String currentRequst = request.get(0);
         System.out.println(currentRequst);
         request.remove(currentRequst);
         System.out.println("Список запросов после обработки очердного запроса: " + request);

     }
}
