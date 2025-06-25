package prof.homeworks._06_19_Lesson2.task1;

public class AnimalsUtil {
    public static void printOnlyDog(Animal[] animals){
        for (Animal animal :animals){
            if ("Dog".equals(animal.getType())){
                System.out.println(animal);
            }
        }
    }
}
