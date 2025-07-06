package prof.lessons._06_23_Lesson3.mediaLibrary.service;

import prof.lessons._06_23_Lesson3.mediaLibrary.dto.BookDto;
import prof.lessons._06_23_Lesson3.mediaLibrary.entity.Book;

public class Converter {
    public Book fromDto(BookDto dto) {
        return new Book(dto.getTitle(), dto.getAuthor(), dto.getYear(), dto.getPageCounter());
    }
}
