package prof.lessons._07_03_Lesson8.practice.linked;


import prof.lessons._07_03_Lesson8.practice.array.BrowserHistoryArrayList;

public class BrowserHistoryLinkedListDemo {
    public static void main(String[] args) {

   BrowserHistoryLinkedList bh = new BrowserHistoryLinkedList();

   bh.addPageBegin("google.com");
   bh.addPageBegin("github.com");
   bh.addPageEnd("oracle.com");
   bh.addPageEnd("wikipedia.com");


   bh.printOldestFirst();


   bh.printNewestFirst();
    }
}
