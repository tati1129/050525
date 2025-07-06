package basic._05_26_Lesson13.while3;

import basic._05_26_Lesson13.UserInputStatic;


public class CatUtil {
    public Cat createCat(int catCounter) {
        String catName = UserInputStatic.inputString("Введите имя кошки для регистрации в журнале под номером " + catCounter + " : ");
        Cat cat = new Cat(catName);
        return cat;
    }
}
