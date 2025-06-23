package prof.lessons._06_18_Lesson1.inharitance.dog;

public class Dog {
    private String name;
    private String breed;
    private boolean visitGroomer;


    public Dog(String name, String breed) {
        this.name = name;
        this.breed = breed;
        this.visitGroomer = visitGroomer;
    }

    public boolean isVisitGroomer() {
        return visitGroomer;
    }

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public void voice(String message){
        System.out.println(message);
        System.out.println("Gav-gav!");
    }
}
