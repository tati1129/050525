package prof.lessons._06_18_Lesson1.inharitance.dogInharitance;

public class DogDemo {
    public static void main(String[] args) {
        BigDog bigDog = new BigDog("JJ", "dkl",true);
        SmallDog smallDogs = new SmallDog("kdl", "flj", true);
     bigDog.voice("Громко лает");
        System.out.println(bigDog.getBreed());
        System.out.println(bigDog.getName());
    }
}
