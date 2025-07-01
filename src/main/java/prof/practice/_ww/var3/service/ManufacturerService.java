package prof.practice._ww.var3.service;

import prof.practice._ww.var3.entity.Manufacture;
import prof.practice._ww.var3.repoitiry.ManufacturerRepository;
import prof.practice._ww.var3.repoitiry.TypeRepository;

public class ManufacturerService {
    private ManufacturerRepository manufacturerRepository;
    private TypeRepository typeRepository;

    public ManufacturerService(ManufacturerRepository manufacturerRepository, TypeRepository typeRepository) {
        this.manufacturerRepository = manufacturerRepository;
        this.typeRepository = typeRepository;
    }

    public String addManufacterer(String manufact, String teaType){
        return manufacturerRepository.addTeaTypeToManufacturer(manufact, teaType);
    }

    public Manufacture findByNameManufacturer(String manufact){
        return  manufacturerRepository.findByName(manufact);
    }

    public Manufacture[] getAll(){
        return manufacturerRepository.getAll();
    }
}
