package prof.lessons._06_18_Lesson1.inharitance.dogInharitance;

public class SmallDog extends Dog {


    private boolean visitGroomer;

    public SmallDog(String name, String breed, boolean visitGroomer) {
        super(name, breed);
        this.visitGroomer = visitGroomer;
    }

    public boolean isVisitGroomer() {
        return visitGroomer;
    }

    public void visitGroomer() {
    }

    ;


    @Override
    public void voice(String message) {
        System.out.println(message);
        System.out.println("gav-gav-gav-gav-gav-gav-gav-gav!");
    }
}
