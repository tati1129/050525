package prof.homeworks._06_18_Lesson1.abstraction.task2;

import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        Guitar guitar = new Guitar();
        Piano piano = new Piano();
        Violin violin = new Violin();

        MusicalInstrument[] instruments = {guitar,piano,violin};

        for (int i = 0; i < instruments.length; i++) {
            instruments[i].playNote("do");
        }
    }
}
