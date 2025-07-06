package prof.lessons._07_03_Lesson8.practice.queue;

import java.util.*;

public class BrowserHistoryDeque {

    private Deque<String> history = new ArrayDeque<>();

    // добавим страницу в конец
    public void addPage(String url){
        history.offer(url);
    }



    public void printOldestFirst(){
        System.out.println("История браузера (старые - новые)");
        for (String url : history){
            System.out.println(url);
        }
    }

    public void printNewestFirst(){
        System.out.println("История браузера (новые - старые)");
        Iterator<String> iterator = history.descendingIterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
