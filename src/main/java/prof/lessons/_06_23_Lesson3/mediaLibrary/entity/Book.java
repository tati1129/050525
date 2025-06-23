package prof.lessons._06_23_Lesson3.mediaLibrary.entity;

import prof.lessons._06_23_Lesson3.mediaLibrary.dto.BookDto;

public class Book  extends MediaItem{

    private int pageCounter;

    public Book(String title, String author, int year, int pageCounter) {
        super(title, author, year);
        this.pageCounter = pageCounter;
    }

    public int getPageCounter() {
        return pageCounter;
    }

    @Override
    public void printInfo() {
        System.out.println(
                "Book: " + getTitle() +
                        ", Author: " + getAuthor() +
                        ", year: " + getYear() +
                        ", pages: " + pageCounter
        );
    }

    public static Book fromDto(BookDto dto){
        return new Book(dto.getTitle(), dto.getAuthor(),dto.getYear(),dto.getPageCounter());
    }
}
