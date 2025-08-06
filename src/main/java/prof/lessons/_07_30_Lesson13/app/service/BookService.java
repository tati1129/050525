package prof.lessons._07_30_Lesson13.app.service;

import prof.lessons._07_30_Lesson13.app.dto.BookCreateRequest;
import prof.lessons._07_30_Lesson13.app.dto.ResponceMessage;
import prof.lessons._07_30_Lesson13.app.entity.Author;
import prof.lessons._07_30_Lesson13.app.entity.Book;
import prof.lessons._07_30_Lesson13.app.repository.BookRepository;

import java.util.Optional;

public class BookService {
    private BookRepository repository;
    private AuthorService authorService;

    public BookService(BookRepository repository, AuthorService authorService) {
        this.repository = repository;
        this.authorService = authorService;
    }

//    public ResponceMessage<Book> save(BookCreateRequest dto) {
//        ResponceMessage<Optional<Author>> responceAuthor = authorService.findByName(dto.getAuthorName());
//        if (responceAuthor.getResponseCode() == 400) {
//            return new ResponceMessage<>(400, null, "Bad request. Невозможно создать книгу, автор не найден");
//        }
        ;
//        Book newBook = new Book(dto.getIsbn(), dto.getTitle()), responseAuthor.getBody(), dto.getDescription());
//        Boolean saveResult = repository.saveBook(newBook);
//        if (saveResult) {
//            return new ResponseMessage<>(201, newBook, "Новая книга успешно сохранена");
//        } else {
//            return new ResponseMessage<>(500, null, "Внутренняя ошибка сервера. Сохранить не получилось");
//        }
    }

