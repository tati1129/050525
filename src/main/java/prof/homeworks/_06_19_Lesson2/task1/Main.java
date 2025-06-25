package prof.homeworks._06_19_Lesson2.task1;
/*Задача 1. Фильтруем животных по типу

Описание:
Создайте интерфейс Animal с методом String getType().
Реализуйте два класса: Dog и Cat, реализующих этот интерфейс.
Каждый должен возвращать соответствующий тип: "Dog" или "Cat".
Требуется:
Создайте массив типа Animal[], содержащий объекты Dog и Cat.
Напишите метод printOnlyDogs(Animal[] animals), который выводит только собак.

 */
public class Main {
    public static void main(String[] args) {
        AnimalsUtil util = new AnimalsUtil();

        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        Dog dog3 = new Dog();

        Cat cat1  = new Cat();
        Cat cat2  = new Cat();
        Cat cat3  = new Cat();
        Animal[] animals = {dog1,cat1, dog2, cat2, dog3, cat3 };


        System.out.println("Only dogs:");
        util.printOnlyDog(animals);
    }
}
