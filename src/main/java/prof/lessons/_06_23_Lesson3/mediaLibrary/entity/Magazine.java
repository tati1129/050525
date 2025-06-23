package prof.lessons._06_23_Lesson3.mediaLibrary.entity;

public class Magazine extends MediaItem{

    private int issueNumber;

    public Magazine(String title, String author, int year, int issueNumber) {
        super(title, author, year);
        this.issueNumber = issueNumber;
    }

    @Override
    public void printInfo() {

    }
}
