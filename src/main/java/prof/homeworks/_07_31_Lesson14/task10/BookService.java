package prof.homeworks._07_31_Lesson14.task10;

import java.util.Comparator;
import java.util.List;

public class BookService {
    private BooksRepository booksRepository;
    private final String path = "src/main/java/prof/homeworks/_07_31_Lesson14/task10/dataBooks.csv";

    public BookService() {
        this.booksRepository = new BooksRepository();
        booksRepository.loadFromFile(path);
    }

    public List<Book> findAll() {
        return booksRepository.findAll();
    }

    public List<Book> findBookByTag(String tag) {
        return findAll().stream().filter(b -> b.getTags().stream()
                        .anyMatch(t -> t.equalsIgnoreCase(tag)))
                .sorted(Comparator.comparing(b -> b.getTitle()))
                .toList();
    }

    public List<String> findListUniqueTag() {
        List<String> uniqueTags = findAll().stream()
                .flatMap(b -> b.getTags().stream())
                .distinct()
                .sorted((s1, s2) ->s1.compareToIgnoreCase(s2))
                .toList();
        return uniqueTags;
    }
}
