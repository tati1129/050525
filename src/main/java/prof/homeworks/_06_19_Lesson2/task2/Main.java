package prof.homeworks._06_19_Lesson2.task2;

/*
Задача 2. Площадь фигур
Описание:
Создайте интерфейс Shape с методом double getArea().
Реализуйте классы Rectangle и Circle, каждый со своими полями:
Rectangle — width и height.
Circle — radius.
Требуется:
Создайте массив Shape[], содержащий несколько фигур.
Напишите метод printAreas(Shape[] shapes), который выводит площадь каждой фигуры.

 */
public class Main {
    public static void main(String[] args) {
        ShapeUtil util = new ShapeUtil();

        Rectangle rectangle1 = new Rectangle(2, 4);
        Rectangle rectangle2 = new Rectangle(5, 6);
        Rectangle rectangle3 = new Rectangle(11, 11);

        Circle circle = new Circle(3);
        Circle circle2 = new Circle(5);
        Circle circle3 = new Circle(1);
        Shape[] shapes = {rectangle1, rectangle2, rectangle3, circle, circle2, circle3};

        util.printAreas(shapes);
    }
}
