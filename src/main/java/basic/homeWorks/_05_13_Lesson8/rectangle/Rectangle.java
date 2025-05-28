package basic.homeWorks._05_13_Lesson8.rectangle;

public class Rectangle {
    double length;
    double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public Rectangle() {}

    public double calculateArea(double length, double width){
        double result = length * width;
        return result;
    }

    public  double calculatePerimeter(double length, double width){
        double result = (length + width) * 2;
        return result;
    }
}
