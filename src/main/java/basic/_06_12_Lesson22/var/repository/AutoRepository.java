package basic._06_12_Lesson22.var.repository;

import basic._06_12_Lesson22.var.CatalogConfiguration;
import basic._06_12_Lesson22.var.entity.Auto;

import java.util.Random;

public class AutoRepository {

    private String[] models = {"Model S", "Civic", "Corolla", "Mustang", "A4", "3 Series", "CX-5", "Sportage", "E-Class", "Polo"};
    private String[] producers = {"Tesla", "Honda", "Toyota", "Ford", "Audi", "BMW", "Mazda", "Kia", "Mercedes-Benz", "Volkswagen"};

    private Auto[] catalog;
    private int currentQantuty = 0;


    Random random = new Random();

    public AutoRepository() {
        this.catalog = new Auto[CatalogConfiguration.MAX_QUANTITY];
    }

    public void addAuto(int quantity) {
        for (int i = 0; i < catalog.length; i++) {
            String model = models[random.nextInt(models.length)];
            String producer = producers[random.nextInt(producers.length)];
            Auto auto = new Auto(i + 1, model, producer);
            save(auto);
        }

    }

    public boolean save(Auto newAuto) {
        if (currentQantuty < catalog.length) {
            catalog[currentQantuty] = newAuto;
            currentQantuty++;
            return true;
        } else {
            return false;
        }
    }

    public Auto findById(int id) {
        for (int i = 0; i < currentQantuty; i++) {
            if (catalog[i].getIdAuto() == id) {
                return catalog[i];
            }
        }
        return null;
    }

    public Auto findByModel(String model) {
        for (int i = 0; i < currentQantuty; i++) {
            if (catalog[i].getModel().equalsIgnoreCase(model)) {
                return catalog[i];
            }
        }
        return null;
    }

    public Auto findByProducer(String produser) {
        for (int i = 0; i < currentQantuty; i++) {
            if (catalog[i].getProducer().equalsIgnoreCase(produser)) {
                return catalog[i];
            }
        }
        return null;
    }

    public Auto[] getCatalog() {
        return catalog.clone();
    }
}
