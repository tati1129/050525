package basic._06_11_Lesson21.unit;

public class LetterCounterFromText {
    public int countLetter(String text) {
        int count = 0;

        for (int i = 0; i < text.length(); i++) {
            char currentLetter = text.charAt(i);

            if (currentLetter == 'a' ||
                    currentLetter == 'o' ||
                    currentLetter == 'u' ||
                    currentLetter == 'i' ||
                    currentLetter == 'e' ||
                    currentLetter == 'y') {
                currentLetter++;
            }
        }
        return count;
    }
}
