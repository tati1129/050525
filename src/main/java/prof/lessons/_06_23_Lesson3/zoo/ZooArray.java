package prof.lessons._06_23_Lesson3.zoo;

import prof.lessons._06_23_Lesson3.zoo.entity.Animal;
import prof.lessons._06_23_Lesson3.zoo.entity.Bird;
import prof.lessons._06_23_Lesson3.zoo.entity.BirdFlyable;
import prof.lessons._06_23_Lesson3.zoo.entity.Mammal;

public class ZooArray {
    private Animal[] animals;
    private Mammal[] mammals;
    private Bird[] birds;
    private BirdFlyable[] birdFlyables;

    public ZooArray(Animal[] animals, Mammal[] mammals, Bird[] birds, BirdFlyable[] birdFlyables) {
        this.animals = animals;
        this.mammals = mammals;
        this.birds = birds;
        this.birdFlyables = birdFlyables;
    }

    public void createDefaultAnimals(){
        BirdFlyable birdParrot = new BirdFlyable("Kesha",25,"parrot");

        animals[0] = birdParrot;
        birds[0] = birdParrot;
        birdFlyables[0] = birdParrot;

        animals[0].getName();
        birds[0].sound();

        birdFlyables[0].fly();

    }
}
