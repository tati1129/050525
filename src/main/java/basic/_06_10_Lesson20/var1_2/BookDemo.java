package basic._06_10_Lesson20.var1_2;

import basic._06_10_Lesson20.UserInputStatic;

public class BookDemo {
    public static void main(String[] args) {
        int libraryize = UserInputStatic.inputInt("Сколько книг в библиотеке? ");
        int currentQuantity = 0;
        Book[] library = new Book[libraryize];

        while (true) {
            System.out.println("Меню");
            System.out.println("1. Создать новую книгу");
            System.out.println("1. Вывести информацию о списке книг");
            System.out.println("2. Поиск книги по номеру каталогу");
            System.out.println("3. Поиск книги по названю книги ");
            System.out.println("4. Поиск книги по имени автора");
            System.out.println("5. Выход");

            int userInput = UserInputStatic.inputInt("Сделайте Ваш выбор");

            switch (userInput) {
                case 1 -> {
                    if (currentQuantity < library.length) {
                        String bookId = UserInputStatic.inputString("Введите id книги");
                        String bookTitle = UserInputStatic.inputString("Введите название книги");
                        String bookAuthor = UserInputStatic.inputString("Введите автора книги");

                        Book book = new Book(bookId, bookTitle, bookAuthor);

                        library[currentQuantity] = book;
                        currentQuantity++;
                    }
                }
                case 2 -> {
                    if (library != null) {
                        String bookIdSearch = UserInputStatic.inputString("Книгу с каким номером каталога нужно найти? ");
                        for (int i = 0; i < library.length; i++) {
                            Book current = library[i];
                            if (current.getBookId().equals(bookIdSearch)) {
                                System.out.println("Нашли книгу по поиску:");
                                System.out.println("Номер каталога : " + current.getBookId());
                                System.out.println("Название книги : " + current.getTitle());
                                System.out.println("Имя Автора : " + current.getAuthor());
                            }
                        }
                    }

                }
            }

            System.out.println(" Список книг : ");

            for (int i = 0; i < library.length; i++) {
                Book currentBook = library[i];

                System.out.println("Номер каталога : " + currentBook.getBookId());
                System.out.println("Название книги : " + currentBook.getTitle());
                System.out.println("Имя Автора : " + currentBook.getAuthor());
            }

            String bookIdSearch = UserInputStatic.inputString("Книгу с каким номером каталога нужно найти? ");

            for (int i = 0; i < library.length; i++) {
                Book current = library[i];
                if (current.getBookId().equals(bookIdSearch)) {
                    System.out.println("Нашли книгу по поиску:");
                    System.out.println("Номер каталога : " + current.getBookId());
                    System.out.println("Название книги : " + current.getTitle());
                    System.out.println("Имя Автора : " + current.getAuthor());
                }
            }
        }

    }
}
