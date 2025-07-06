package basic.homeWorks._05_13_Lesson8.rectangle;

public class RectangleDemo {
    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle();

        double area = rectangle.calculateArea(3, 4);
        double perimeter = rectangle.calculatePerimeter(5, 6);
        System.out.println(" The area of rectangle is : " + area);
        System.out.println(" The perimeter of rectangle is : " + perimeter);
    }
}
