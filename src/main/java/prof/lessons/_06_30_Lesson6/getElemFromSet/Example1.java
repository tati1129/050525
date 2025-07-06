package prof.lessons._06_30_Lesson6.getElemFromSet;

import java.util.HashSet;
import java.util.Set;

public class Example1 {
    public static void main(String[] args) {
//        Set<String> strings = new HashSet<>();
//
//        strings.add("Murz");
//        strings.add("Barsik");
//        strings.add("Lucky");
//        strings.add("Dexter");
//
//        Set<String> strings = new HashSet<>();


//        if (strings.contains(searchElem)) {
//            System.out.println("Elem is contains");
//        }else {
//            System.out.println("Element not found!");
//        }
        Set<Cat> cats = new HashSet<>();

        Set<String> strings = new HashSet<>();

        cats.add(new Cat("Murz", 2));
        cats.add(new Cat("Barsik", 3));
        cats.add(new Cat("Lucky", 3));
        cats.add(new Cat("Dexter", 5));

        Cat searchCat = new Cat("Lucky", 3);
        //System.out.println(cats);

        // для корректной работы метода contains() ОБЯЗАТЕЛЬНО необходимо
        // переопределить методы equals() и hashCode() у класса Cat
        if (cats.contains(searchCat)) {
            System.out.println("Founded" + searchCat);
        } else {
            System.out.println("Not found");
        }


        // ----- вариант поиска по каким-либо данным из объекта ------

        String searchElem = "Lucky";
        System.out.println("Отмечаем день рождения кота Lucky");

        for (Cat currentCat : cats) {
            if (currentCat.getName().equals(searchElem)) {
                currentCat.setAge(currentCat.getAge() + 1);
            }
            // логика если такого кота нет
        }
        System.out.println(cats);

    }
}
