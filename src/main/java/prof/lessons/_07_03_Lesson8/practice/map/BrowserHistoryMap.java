package prof.lessons._07_03_Lesson8.practice.map;

import java.util.HashMap;
import java.util.Map;

public class BrowserHistoryMap {

    private Map<Integer,String> history  = new HashMap<>();
    private int counter = 0;

    public void addPage(String url){
        history.put(++counter, url );
    }


    public void printNewest(){
        for (int  i = 1;  i <= counter;  i++) {
            System.out.println(history.get(i));
        }
    }

    public void printOldest(){
        for (int  i = counter;  i >=1;  i--) {
            System.out.println(history.get(i));
        }
    }
}
