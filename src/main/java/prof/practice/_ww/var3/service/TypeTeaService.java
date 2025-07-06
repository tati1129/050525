package prof.practice._ww.var3.service;

import prof.practice._ww.var3.entity.TypeOfTea;
import prof.practice._ww.var3.repoitiry.TypeRepository;

public class TypeTeaService {
    private TypeRepository typeRepository;

    public TypeTeaService(TypeRepository typeRepository) {
        this.typeRepository = typeRepository;
    }

    public boolean addTypeOfTea(String type) {
        if (typeRepository.findTypeOfTeaByName(type) != null) {
            return false; // Уже существует — не добавляем
        }

        return typeRepository.addTypeOfTea(type); // Пытаемся добавить
    }

    public TypeOfTea findTeaTypeByName(String type) {
        return typeRepository.findTypeOfTeaByName(type);
    }

    public TypeOfTea[] getallTeaTypes() {
        return typeRepository.getAll();
    }
}
