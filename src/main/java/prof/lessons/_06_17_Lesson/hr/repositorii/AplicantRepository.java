package prof.lessons._06_17_Lesson.hr.repositorii;

import prof.lessons._06_17_Lesson.hr.entity.Aplicant;

public class AplicantRepository {
    Aplicant[] aplicants;
    public int aplicantCounter = 0;

    public AplicantRepository() {
        this.aplicants = new Aplicant[50];
    }

    public String add(Aplicant aplicant) {

            if (aplicantCounter<aplicants.length) {
                aplicants[aplicantCounter++] = aplicant;
                return "Запись добавлена успешно!";
            }
        return "База данных переполнена. ";
    }



    public Aplicant findById(int idForSearch) {

        for (Aplicant aplicant : aplicants) {
            if (aplicant != null) {
                if (aplicant.getId() == idForSearch) {
                    return aplicant;
                }
            }
        }
        return null;
    }

    public Aplicant[] findAll() {
        Aplicant[] allFill = new Aplicant[aplicantCounter];
        for (int i = 0; i < aplicantCounter; i++) {
            allFill[i] = aplicants[i];
        }
        return allFill;
    }

}
