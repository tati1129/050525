package basic._06_12_Lesson22.var.service;

import basic._06_12_Lesson22.var.entity.Auto;
import basic._06_12_Lesson22.var.repository.AutoRepository;

public class AutoService {
    private AutoRepository autoRepository;

    public AutoService(AutoRepository autoRepository) {
        this.autoRepository = autoRepository;
    }

    public boolean addNewAuto(Auto newAuto) {
        if (validateNewAuto(newAuto)) {
            return autoRepository.save(newAuto);
        }
        return false;
    }

    private boolean validateNewAuto(Auto newAuto) {
        if (newAuto.getIdAuto() == 0) {
            return false;
        }
        if (newAuto.getModel().isBlank()) {
            return false;
        }
        if (newAuto.getProducer().isBlank()) {
            return false;
        }
        if (autoRepository.findById(newAuto.getIdAuto()) != null) {
            return false;
        }
        if (autoRepository.findByModel(newAuto.getModel()) != null) {
            return false;
        }
        if (autoRepository.findByProducer(newAuto.getProducer()) != null) {
            return false;
        }
        return true;
    }
}
