package prof.practice._ww.var1;

public class TeaCollection {

    private Tea[] teas;
    private int teaCounter = 0; //индекс элемента массива
    private int teaIndex = 1;// нумерация экземляров класса

    public TeaCollection(int sizeOfTeaCollection) {
        this.teas = new Tea[sizeOfTeaCollection];
    }

    public Tea add(Tea newTea) {
        if (teaCounter < teas.length) {
            Tea tea = new Tea(teaIndex, newTea.getManufacturer(), newTea.getType(), newTea.getVariety());
            teaIndex++;

            teas[teaCounter] = newTea;
            teaCounter++;
            return tea;
        } else {
            return null;
        }
    }


    public Tea add2(Tea newTea) {
         /*
      Процедура "удаления" элементов из массива в самом простом варианте заключается
      в том, что в ячейку массива прописывается null. Тем самым мы "стираем" ссылку на
      экземпляр класса и у нас больше нет никакой переменной (или ячейки массива),
      где бы эта ссылка хранилась.

      Если мы будем реализовывать процедуру "удаления" элементов из нашего массива,
      то это значит, что какие-то элементы массива могут быть "null"

      То есть среди элементов будут null и чтобы добавить новый элемент нам
      нужно будет пройтись по всему массиву и найти первую незанятую ячейку
      и положить новый элемент туда
         */
//        for (int i = 0; i < teas.length; i++) {
//            if (teas[i] == null) {
//                Tea tea = new Tea(teaIndex, newTea.getManufacturer(), newTea.getType(), newTea.getVariety());
//                teaIndex++;
//
//                teas[i] = tea;
//                return tea;
//
//            } else {
//                return null;
//            }
//        }
        return null;
    }

    public Tea updateTea(int idTeaForUpdate, String newManufacturer) {

        Tea teaForUpdate = findById(idTeaForUpdate);
        teaForUpdate.setManufacturer(newManufacturer);
        return teaForUpdate;
    }


    public boolean deleteTeaFroCollection(int idTeaForDelete) {

        for (int i = 0; i < teaCounter; i++) {
            if (teas[i].getId() == idTeaForDelete) {
                teas[i] = null;
                // сдвигаем все элементы вправо от найденного
                for (int j = 1; j < teaCounter-1; j++) {
                    teas[j] = teas[j + 1];
                }
                // "зануляем" последний "висящий" элемент
                teas[teaCounter - 1] = null;
                // уменьшаем счетчик реально существующих элементов
                teaCounter--;
                return true;
            }
        }
        return false;
    }


    public Tea findById(int idTeaForSearch) {
        for (int i = 0; i < teaCounter; i++) {
            if (teas[i].getId() == idTeaForSearch) {
                return teas[i];
            }
        }
        return null;
    }

//    public Tea[] findByCriteria(String searchCriteria, String teaParametrForSearch){
//        int counter = 0;
//        for (int i = 0; i < teaCounter; i++) {
//            if (searchCriteria.equalsIgnoreCase("type") && teas[i].getType().equalsIgnoreCase(teaParametrForSearch)) counter++;
//            if (searchCriteria.equalsIgnoreCase("variety") && teas[i].getVariety().equalsIgnoreCase(teaParametrForSearch)) counter++;
//        }
//
//        Tea[] founded = new Tea[counter];
//
//
//    }


    public Tea[] findByTeaType(String typeForSearch) {
        int counter = 0;
        for (int i = 0; i < teaCounter; i++) {
            if (teas[i].getType().equalsIgnoreCase(typeForSearch)) {
                counter++;
            }
        }

        Tea[] foundedTea = new Tea[counter];
        int foundedTeaIndex = 0;
        for (int i = 0; i < teaCounter; i++) {
            if (teas[i].getType().equalsIgnoreCase(typeForSearch)) {
                foundedTea[foundedTeaIndex++] = teas[i];
            }
        }
        return foundedTea;
    }

    public Tea[] findByVariety(String typeForVariety) {
        int counter = 0;
        for (int i = 0; i < teaCounter; i++) {
            if (teas[i].getVariety().equalsIgnoreCase(typeForVariety)) {
                counter++;
            }
        }

        Tea[] foundedTea = new Tea[counter];
        int foundedTeaIndex = 0;
        for (int i = 0; i < teaCounter; i++) {
            if (teas[i].getVariety().equalsIgnoreCase(typeForVariety)) {
                foundedTea[foundedTeaIndex++] = teas[i];
            }
        }
        return foundedTea;
    }


    public Tea[] findByManufactorer(String manufacturer){
        int counter = 0;
        for (int i = 0; i < teaCounter; i++) {
            if (teas[i].getManufacturer().equalsIgnoreCase(manufacturer)){
                counter++;
            }
        }
        Tea[] teaByManufcturer = new Tea[counter];
        int index = 0;
        for (int i = 0; i < teaCounter; i++) {
            if (teas[i].getManufacturer().equalsIgnoreCase(manufacturer)){
                teaByManufcturer[index++] = teas[i];
            }
        }
        return teaByManufcturer;
    }

    public Tea[] findAll(){
        Tea[] allTea = new Tea[teaCounter];
        for (int i = 0; i <teaCounter ; i++) {
            allTea[i] = teas[i];
        }
        return  allTea;
    }

}
