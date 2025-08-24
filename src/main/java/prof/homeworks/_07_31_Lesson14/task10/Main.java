package prof.homeworks._07_31_Lesson14.task10;
/*
Дан список объектов Book, содержащий информацию о книгах, включая название, автора и список тегов.
    Необходимо получить список всех уникальных тегов
 */
public class Main {
    public static void main(String[] args) {

        BookService service = new BookService();
        System.out.println(service.findListUniqueTag());
        System.out.println("_______________________");
        System.out.println(service.findBookByTag("жизнь"));
        System.out.println("_______________________");
        System.out.println(service.findListUniqueTag());    }
}
