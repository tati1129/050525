package prof.lessons._06_23_Lesson3.zoo.entity;

public class Bird extends Animal {
    private String breed;

    public Bird(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    @Override
    public void sound() {
        System.out.println("I'm bird");
    }
}
