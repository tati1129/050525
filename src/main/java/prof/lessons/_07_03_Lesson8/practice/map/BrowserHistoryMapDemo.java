package prof.lessons._07_03_Lesson8.practice.map;

public class BrowserHistoryMapDemo {
    public static void main(String[] args) {
        BrowserHistoryMap bh = new BrowserHistoryMap();

        bh.addPage("ZZZ");
        bh.addPage("aaa");
        bh.addPage("elkh");

        bh.printNewest();
        bh.printOldest();
    }
}
