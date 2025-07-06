package prof.lessons._06_18_Lesson1.inharitance.dog;

public class DogDemo {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Zeus", "Cane corso");

        dog1.voice("Наша собака громко лает!");

        Dog dog2 = new Dog("Gera", "Cane corsa");
        Dog dog3 = new Dog("Lola", "York terrier");
        Dog dog4 = new Dog("Gera", "York terrier");

        Dog[] dogs = {dog1, dog2, dog3, dog4};
    }

    BigDog[] bigDogs = new BigDog[3];
    SmallDog[] smallDogs = new SmallDog[2];
}
