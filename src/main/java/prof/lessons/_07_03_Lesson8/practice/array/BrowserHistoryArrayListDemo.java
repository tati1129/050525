package prof.lessons._07_03_Lesson8.practice.array;

import java.util.ArrayList;

public class BrowserHistoryArrayListDemo {
    public static void main(String[] args) {

   BrowserHistoryArrayList bh = new BrowserHistoryArrayList();

   bh.addPAge("google.com");
   bh.addPAge("github.com");
   bh.addPAge("oracle.com");
   bh.addPAge("wikipedia.com");


   bh.printOldestFirst();


   bh.printNewestFirst();
    }
}
