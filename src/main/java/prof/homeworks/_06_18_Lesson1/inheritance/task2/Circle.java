package prof.homeworks._06_18_Lesson1.inheritance.task2;

public class Circle extends Shape {

    private double pi;

    public Circle(String figurName, int side1) {
        super(figurName, side1);
        this.pi = Math.PI;
    }

    @Override
    public int square() {
        int result = (int) (getSide1() * getSide1() * pi);
        System.out.println("Square of " + getFigurName() + " is " + result);
        return result;
    }

    @Override
    public int perimetr() {
        int result = (int) (2 * pi * getSide1());
        System.out.println("Perimetr of " + getFigurName() + " is " + result);
        return result;
    }


}
