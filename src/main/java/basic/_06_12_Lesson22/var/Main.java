package basic._06_12_Lesson22.var;

import basic._06_12_Lesson22.var.repository.AutoRepository;
import basic._06_12_Lesson22.var.service.AutoService;

public class Main {
    public static void main(String[] args) {

        AutoRepository autoRepository = new AutoRepository();
        AutoService autoService = new AutoService(autoRepository);

//  autoService.addNewAuto()

    }
}
