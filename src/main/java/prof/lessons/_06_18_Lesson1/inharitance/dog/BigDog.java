package prof.lessons._06_18_Lesson1.inharitance.dog;

public class BigDog {


    private String name;
    private String breed;
    private boolean isProtectDiploma;

    public BigDog(String name, String breed) {
        this.name = name;
        this.breed = breed;
        this.isProtectDiploma = isProtectDiploma;
    }

    public boolean isProtectDiploma() {
        return isProtectDiploma;
    }

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public void voice(String message) {
        System.out.println(message);
        System.out.println("Gav-gav!");
    }
}

