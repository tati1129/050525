package basic.homeWorks._06_11_Leson21;

public class Service {
    int[] array;
    int size;

    public int[] createArr() {
        size = UserInputStatic.inputInt("Введите длину массива (количество элементов)");
        if (size > 0) {
            array = new int[size];
            for (int i = 0; i < size; i++) {
                array[i] = UserInputStatic.inputInt("Введите значение типа int");
            }
            return array;
        }
        return null;
    }

    public int[] createArrEvenElem() {
        int[] newEvenElemArr = new int[0];
        int index = 0;
        int count = 0;
        if (array != null) {
            for (int i = 0; i < array.length; i++) {
                if (array[i] % 2 == 0) {
                    count++;
                }
            }
            newEvenElemArr = new int[count];
            for (int i = 0; i < array.length; i++) {
                if (array[i] % 2 == 0) {
                    newEvenElemArr[index++] = array[i];
                }
            }

        }
        return newEvenElemArr;
    }

    public double createAVG() {
        double result = 0;
        int countElem = array.length;
        int summ = 0;
        if (array != null) {
            for (int i = 0; i < countElem; i++) {
                summ += array[i];
            }
        }
        result = Math.round((summ / countElem) * 100.0) / 100.0;
        return result;
    }

}

