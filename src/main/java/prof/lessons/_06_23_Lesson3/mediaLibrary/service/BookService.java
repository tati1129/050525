package prof.lessons._06_23_Lesson3.mediaLibrary.service;

import prof.lessons._06_23_Lesson3.mediaLibrary.dto.BookDto;
import prof.lessons._06_23_Lesson3.mediaLibrary.entity.Book;
import prof.lessons._06_23_Lesson3.mediaLibrary.repisitory.BookRepository;

public class BookService {

    private BookRepository repository;
    private Converter converter;

    public BookService(BookRepository repository, Converter converter) {
        this.repository = repository;
        this.converter = converter;
    }

    public Book addNewBook(BookDto bookDto) {
        // можем проверить, что такой книги с таким названием у нас еще нет

        // процесс создания объекта с использованием данных из другого класса
        // называется маппинг (по сути это сопоставление полей одного класса
        // с полями другого и передача данных на основе этого ссответствия)

        //Book book = new Book(bookDto.getTitle(), bookDto.getAuthor(), bookDto.getYear(), bookDto.getPageCounter());

        //Book book = Book.fromDto(bookDto);

        Book book = converter.fromDto(bookDto);
        return book;
    }
}
