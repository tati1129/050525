package prof.lessons._06_18_Lesson1.inharitance.dogInharitance;

public class BigDog extends Dog {
    private boolean isProtectDiploma;

    public BigDog(String name, String breed, boolean isProtectDiploma) {
        super(name, breed);
        this.isProtectDiploma = isProtectDiploma;
    }

    public boolean isProtectDiploma() {
        return isProtectDiploma;
    }


    public void voice(String message) {
        System.out.println(message);
        System.out.println("Gav-gav!");
    }
}

