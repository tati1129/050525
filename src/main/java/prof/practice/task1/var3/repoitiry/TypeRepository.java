package prof.practice.task1.var3.repoitiry;

import prof.practice.task1.var3.entity.TypeOfTea;

import java.util.Arrays;

public class TypeRepository {
    TypeOfTea[] typeOfTeas;
    private int countTypeofTea = 0;

    public TypeRepository(int quantity) {
        this.typeOfTeas = new TypeOfTea[quantity];

    }

    // Метод добавления типа чая
    public boolean addTypeOfTea(String type) {
        if (countTypeofTea < typeOfTeas.length) {
            TypeOfTea newTypeOfTea = new TypeOfTea(type);
            typeOfTeas[countTypeofTea] = newTypeOfTea;
            return true;
        }
        return false;
    }

    public TypeOfTea findTypeOfTeaByName(String type) {

        for (int i = 0; i < countTypeofTea; i++) {
            if (typeOfTeas[i].getTypeName().equals(type)) {
                return typeOfTeas[i];
            }
        }
        return null;
    }


    public TypeOfTea[] getAll() {
        int index = 0;
        TypeOfTea[] typeAll = new TypeOfTea[countTypeofTea];
        for (int i = 0; i < countTypeofTea; i++) {
            if (typeOfTeas[i] != null) {
                typeAll[index++] = typeOfTeas[i];
            }
        }
        return typeAll;
    }
}
