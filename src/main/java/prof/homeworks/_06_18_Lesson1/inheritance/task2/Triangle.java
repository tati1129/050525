package prof.homeworks._06_18_Lesson1.inheritance.task2;

public class Triangle extends Shape{

    private  int side2;
    private  int side3;

    public Triangle(String figurName, int side1, int side2, int side3) {
        super(figurName, side1);
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    public int square() {
        int p = (getSide1() + side2 + side3) / 2;

        int result = (int) Math.sqrt(p*((p - getSide1()) + (p - side2) + (p -side3)) / 2);
        System.out.println("Square of " + getFigurName() + " is " + result );
        return result;
    }

    @Override
    public int perimetr() {
        int result = getSide1() + side2 + side3;
        System.out.println("Perimetr of " + getFigurName() + " is " + result );
        return result;
    }
}
