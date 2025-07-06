package prof.homeworks._06_18_Lesson1.inheritance.task2;

/*
Определите абстрактный класс Shape с методом для вычисления площади. Создайте классы Circle, Rectangle и Triangle, наследующие Shape и реализующие метод вычисления площади в соответствии с формой каждой фигуры.
 */
public class Main {
    public static void main(String[] args) {

        Circle circle = new Circle("Circle", 5);
        Triangle triangle = new Triangle("Triangle", 2, 3, 4);
        Rectangle rectangle = new Rectangle("Rectangle", 4, 5);

        Shape[] figures = {circle, triangle, rectangle};

        for (Shape figure : figures) {
            figure.perimetr();
            figure.square();
        }
    }
}
