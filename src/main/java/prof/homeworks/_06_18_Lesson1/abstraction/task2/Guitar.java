package prof.homeworks._06_18_Lesson1.abstraction.task2;

public class Guitar extends MusicalInstrument {
    @Override
    public void playNote(String note) {

        System.out.println("Гитара играет ноту " + note + " — струнный звук: Тинь-тинь!");
    }
}
