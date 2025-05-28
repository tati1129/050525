package basic._05_26_Lesson13.while3;

public class CatDemo {
    public static void main(String[] args) {
        CatUtil util = new CatUtil();

        int catCountter = 1;

        while (catCountter <= 3) {

            Cat cat = util.createCat(catCountter);
            System.out.println("Кошка " + cat.getName() + " зарегистрирована в журнале посещений");
            catCountter++;
        }
        System.out.println("Приняли " + catCountter + "кошек. Прием окончен.");
    }
}
