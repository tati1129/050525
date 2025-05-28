package _05_28_Lesson15.array.arrayOperations;

public class FindElemArr {
    public static void main(String[] args) {

        String[] strArr = {"word1","word4", "word3", "word5", "word3"};
        String elemForSearch = "word3";

        for (int i = 0; i < strArr.length; i++) {
            if (strArr[i].equals(elemForSearch)) {
                System.out.println("Искомый элемент " + elemForSearch + " найден в массиве по индексу -> " + i);
            }

        }
        System.out.println("Не найдено!");

    }
}
