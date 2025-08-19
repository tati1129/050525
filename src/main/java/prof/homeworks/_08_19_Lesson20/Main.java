package prof.homeworks._08_19_Lesson20;

import prof.homeworks._08_19_Lesson20.menu.Menu;
import prof.homeworks._08_19_Lesson20.service.CountryCodeManager;

/*
Дана коллекция Person - Имя, возраст, список навыков (например языки программирования)
   Нужно найти все уникальные навыки которыми обладают люди старше 25 лет и отсортировать их
 */
public class Main {
    public static void main(String[] args) {
        CountryCodeManager codeManager = new CountryCodeManager();
        Menu menu = new Menu(codeManager);

        menu.start();
    }
}
