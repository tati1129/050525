package prof.homeworks._06_18_Lesson1.inheritance.task2;

public class Rectangle extends Shape {

    private int side2;

    public Rectangle(String figurName, int side1, int side2) {
        super(figurName, side1);
        this.side2 = side2;
    }

    @Override
    public int perimetr() {
        int result = (getSide1()+side2) * 2;
        System.out.println("Square of " + getFigurName() + " is " + result );
        return result;
    }

    @Override
    public int square() {
        int result = getSide1()*side2;
        System.out.println("Perimetr of " + getFigurName() + " is " + result );
        return result;
    }
}
