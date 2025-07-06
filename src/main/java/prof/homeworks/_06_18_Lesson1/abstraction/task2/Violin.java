package prof.homeworks._06_18_Lesson1.abstraction.task2;

public class Violin extends MusicalInstrument {


    @Override
    public void playNote(String note) {
        System.out.println("Скрипка играет ноту " + note + " — смычковый звук: Вииииинь!");
    }
}
