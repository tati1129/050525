package prof.lessons._07_02_Lesson7.practice.task1;

import java.util.Objects;

public class Cat implements Comparable<Cat> {
    private String name;
    private int age;
    private CatColor color;

    public Cat(String name, int age, CatColor color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public String getName() {

        return name;
    }

    public int getAge() {
        return age;
    }

    public CatColor getColor() {
        return color;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Cat cat)) return false;
        return Objects.equals(name, cat.name) && color == cat.color;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, color);
    }

    @Override
    public int compareTo(Cat anotherCat) {
        //int result = getColor().compareTo(anotherCat.getColor()); сорт еще и по цвету(в алф.порядке)
        int result = getColor().name().compareTo(anotherCat.getColor().name());
        if (result == 0) {
            result = getName().compareTo(anotherCat.getName());
        }
        return result;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color=" + color +
                '}';
    }
}
