package prof.homeworks._06_19_Lesson2.task2;

public class Circle implements Shape{
    private  double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.round(Math.PI*radius*radius*100.0)/100.0;
    }
}
