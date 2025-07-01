package prof.lessons._07_02_Lesson7.practice.task1;



import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class CatDemo {
    public static void main(String[] args) {

        Set<Cat> cats = new TreeSet<>();

        cats.add(new Cat("Bars", 2, CatColor.BLACK));
        cats.add(new Cat("Murz", 3, CatColor.WHITE));
        cats.add(new Cat("Lucky", 4, CatColor.GREY));
        cats.add(new Cat("Dexter", 2, CatColor.GREY));
        cats.add(new Cat("Garfield", 3, CatColor.WHITE));
        cats.add(new Cat("Bars", 5, CatColor.GREY));
        cats.add(new Cat("Leo", 4, CatColor.BLUE));
        cats.add(new Cat("Tom", 4, CatColor.WHITE));
        cats.add(new Cat("Tim", 3, CatColor.BLUE));

        for (Cat cat :cats){
            System.out.println(cat);
        }

    }


}
