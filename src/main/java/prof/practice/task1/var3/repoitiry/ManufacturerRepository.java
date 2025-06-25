package prof.practice.task1.var3.repoitiry;

import prof.practice.task1.var3.entity.Manufacture;
import prof.practice.task1.var3.entity.TypeOfTea;

public class ManufacturerRepository {
    Manufacture[] manufactures;
    private int counterManufacturer = 0;
    private TypeRepository typeRepository;
    private TeaRepository teaRepository;

    public ManufacturerRepository(int quantity, TypeRepository typeRepository, TeaRepository teaRepository) {
        this.manufactures = new Manufacture[quantity];
        this.typeRepository = typeRepository;
        this.teaRepository = teaRepository;
    }

    public boolean addManufacture(String manufact) {
        Manufacture manufactureNew = new Manufacture(manufact);
        return true;
    }


    // Метод для добавления типа чая к производителю
    public String addTeaTypeToManufacturer(String manufactureForSearch, String teaType) {
        Manufacture findedManuf = findByName(manufactureForSearch);

        if (findedManuf == null) {
            return "Ошибка! Производитель " + manufactureForSearch + " не найден производитель.";
        }

        // Проверяем, существует ли тип чая

        TypeOfTea existingTeaType = typeRepository.findTypeOfTeaByName(teaType);
        if (existingTeaType != null) {
            return "Ошибка! Тип чая '" + teaType + "' уже существует.";
        }
        // Добавляем тип чая в общий репозиторий
        boolean addedToRep = typeRepository.addTypeOfTea(teaType);
        if (addedToRep) {
            TypeOfTea newTypeTea = new TypeOfTea(teaType);
            return findedManuf.addTeaType(newTypeTea);
        } else {
            return "Ошибка: репозиторий типов чая переполнен.";
        }
    }






    public String saveManufacturer(Manufacture manufacture) {
        if (counterManufacturer < manufactures.length) {
            manufactures[counterManufacturer++] = manufacture;
            return "Производитель успешно добавлен.";
        } else {
            return "Ошибка: достигнут лимит на количество производителей.";
        }
    }

    public Manufacture findById(int id) {
        for (int i = 0; i < counterManufacturer; i++) {
            if (manufactures[i].getId() == id) {
                return manufactures[i];
            }

        }
        return null;
    }

    public Manufacture findByName(String name) {
        for (int i = 0; i < counterManufacturer; i++) {
            if (manufactures[i].getName().equals(name)) {
                return manufactures[i];
            }
        }
        return null;
    }

    public Manufacture[] getAll() {
        int index = 0;
        Manufacture[] allManufacturer = new Manufacture[counterManufacturer];
        for (int i = 0; i < counterManufacturer; i++) {
            if (manufactures[i] != null) {
                allManufacturer[index++] = manufactures[i];
            }
        }
        return allManufacturer;
    }


}