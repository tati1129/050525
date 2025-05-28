package basic._05_15_Lesson8.cat;

public class CatDemo {
    public static void main(String[] args) {
        CatService service = new CatService();
        Cat cat = new Cat("Barsik", 4);
        service.catBirthay(cat);
        System.out.println(cat);

//        System.out.println("Сегодня у питомца день рождения!");
//        cat.setAge(cat.getAge()+1);

        System.out.println(cat);

        Cat cat2 = new Cat("Murzik", 2);

        service.catBirthay(cat);

//        System.out.println("Сегодня у питомца день рождения!");
//        cat2.setAge(cat2.getAge()+1);

        System.out.println(cat2);
    }
}
