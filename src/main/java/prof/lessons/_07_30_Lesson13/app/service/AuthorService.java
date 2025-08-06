package prof.lessons._07_30_Lesson13.app.service;

import prof.lessons._07_30_Lesson13.app.dto.AuthorCreateRequest;
import prof.lessons._07_30_Lesson13.app.dto.ResponceMessage;
import prof.lessons._07_30_Lesson13.app.entity.Author;
import prof.lessons._07_30_Lesson13.app.repository.AuthorRepository;

import java.util.List;
import java.util.Optional;

public class AuthorService {
    private AuthorRepository repository;

    public AuthorService(AuthorRepository repository) {
        this.repository = repository;
    }

      /*
    - добавить нового автора
    - найти по id
    - найти по имени
    - найти всех
     */


    public ResponceMessage<Boolean> saveNewAuthor(AuthorCreateRequest dto) {
        if (repository.findByName(dto.getAuthorName()).isPresent()) {
            return new ResponceMessage<>(400, false, "Такой автор уже есть");
        }
        Author newAuthor = new Author(dto.getId(), dto.getAuthorName(), dto.getInfo());
        return new ResponceMessage<>(201, true, "Автор успешно сохранен!");
    }

    public ResponceMessage<List<Author>> findAll() {
        List<Author> authors = repository.getAuthors();
        if (authors.isEmpty()) {
            return new ResponceMessage<>(202, authors, "База данных пуста");
        } else {
            return new ResponceMessage<>(200, authors, "");
        }
    }


    public ResponceMessage<Optional<Author>> findById(Integer id) {
        Optional<Author> optionalAuthor = repository.findById(id);
        if (optionalAuthor.isPresent()) {
            return new ResponceMessage<>(200,optionalAuthor,"Автор найден");
        }else {
            return new ResponceMessage<>(404,null,"Автор в id = " + id + " не найден");
    }
}

    public ResponceMessage<Optional<Author>> findByName(String name) {
        Optional<Author> optionalAuthor = repository.findByName(name);
        if (optionalAuthor.isPresent()) {
            return new ResponceMessage<>(200,optionalAuthor,"Автор найден");
        }else {
            return new ResponceMessage<>(404,null,"Автор в именем : " + name + " не найден");
        }
    }
}
