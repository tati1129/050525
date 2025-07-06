package prof.lessons._06_23_Lesson3.mediaLibrary.repisitory;

import prof.lessons._06_23_Lesson3.mediaLibrary.entity.Magazine;

public interface MagazinRepository {
    public Magazine save(Magazine magazine);

    public Magazine findByTitle(String title);

    public Magazine[] findByAuthor(String author);
}
