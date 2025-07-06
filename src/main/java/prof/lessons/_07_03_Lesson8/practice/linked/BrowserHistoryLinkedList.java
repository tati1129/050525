package prof.lessons._07_03_Lesson8.practice.linked;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class BrowserHistoryLinkedList {
    private List<String> history = new LinkedList<>();

    // добавим страницу в конец
    public void addPageEnd(String url){
        history.add(url);
    }

    public void addPageBegin(String url){
        history.add(0,url);
    }

    public void printOldestFirst(){
        System.out.println("История браузера (старые - новые)");
        for (String url : history){
            System.out.println(url);
        }
    }

    public void printNewestFirst(){
        System.out.println("История браузера (новые - старые)");
        for (int i = history.size()-1 ; i >=0 ; i--) {
            System.out.println(history.get(i));
        }
    }
}
