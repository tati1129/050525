package prof.practice._ww.var1;

public class TeaUtil {
    /*
    сортировка выбором (selection sort) массива teas по полю manufacturer (alphabetically)
     */
    public Tea[] sortByManufacturer(Tea[] teas){
        Tea[] unsortedArr = teas.clone();

        int  length = unsortedArr.length;

        for (int i = 0; i < length-1; i++) {
            // находим индекс минимального (по производителю) элемента в диапазоне [i.. len - 1]
            int minIndex = i;
            for (int j = i+1; j < length; j++) {
                String manuJ = unsortedArr[j].getManufacturer();
                String manuNin = unsortedArr[minIndex].getManufacturer();
                if (manuJ.compareToIgnoreCase(manuNin) < 0){
                    minIndex = j;
                }
            }

            // меняем местами unsortedArray[i] и unsortedArray[minIdx]
            if (minIndex != i){
                Tea temp = unsortedArr[i];
                unsortedArr[i] = unsortedArr[minIndex];
                unsortedArr[minIndex] = temp;
            }
        }
        return unsortedArr;
    }

}
