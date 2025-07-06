package prof.homeworks._06_19_Lesson2.task2;

public class ShapeUtil {
    public static void printAreas(Shape[] shapes) {
        for (Shape shape : shapes) {
            System.out.println(" The area of figure " + shape.getClass().getSimpleName() + " is : " + shape.getArea());
        }
    }
}
