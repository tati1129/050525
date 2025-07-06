package prof.homeworks._06_18_Lesson1.abstraction.task2;

public class Piano extends MusicalInstrument {
    @Override
    public void playNote(String note) {
        System.out.println("Пианино играет ноту " + note + " — клавишный звук: Динь-дон!");
    }
}
