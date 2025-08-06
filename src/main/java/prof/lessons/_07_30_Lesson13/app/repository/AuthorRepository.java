package prof.lessons._07_30_Lesson13.app.repository;

import prof.lessons._07_30_Lesson13.app.entity.Author;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class AuthorRepository {
   private final List<Author> authors = new ArrayList<>();

    public boolean save(Author author){
        return authors.add(author);
    }

    public List<Author> getAuthors() {
        return authors;
    }

    public Optional<Author> findById(Integer id){
        for (Author author:authors){
            if (author.getId() ==id){
                return Optional.of(author);
            }
        }
        return Optional.empty();
    }

    public Optional<Author> findByName(String name){
        for (Author author:authors){
            if (author.getAuthorName().equals(name)){
                return Optional.of(author);
            }
        }
        return Optional.empty();
    }
}
