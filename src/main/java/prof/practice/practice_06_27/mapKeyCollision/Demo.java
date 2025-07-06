package prof.practice.practice_06_27.mapKeyCollision;

import java.util.HashMap;

public class Demo {
    public static void main(String[] args) {
        HashMap<CatOwner, Cat> map = new HashMap<>();

        map.put(new CatOwner("Petr"), new Cat("Bars"));

        System.out.println("map = " + map);

        CatOwner owner = new CatOwner("Vasjy");
        Cat cat = new Cat("Lu");
        map.put(owner, cat);

        //если не переопределить хэш код в классе, то при добавлении в качестве ключа, то может перезаписаться
        owner.setName("Ruslan");
        System.out.println("map = " + map);

        Cat catFromMap = map.get(owner);
    }
}

