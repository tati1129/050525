package prof.lessons._07_03_Lesson8.practice.queue;


public class BrowserHistoryDequeDemo {
    public static void main(String[] args) {

BrowserHistoryDeque bh = new BrowserHistoryDeque();


   bh.addPage("google.com");
   bh.addPage("github.com");
   bh.addPage("oracle.com");
   bh.addPage("wikipedia.com");


   bh.printOldestFirst();


   bh.printNewestFirst();
    }
}
