package basic._06_12_Lesson22.var.entity;

import java.util.Objects;

public class Auto {
    private int idAuto;
    private String model;
    private String producer;

    public Auto(int idAuto, String model, String producer) {
        this.idAuto = idAuto;
        this.model = model;
        this.producer = producer;
    }

    public int getIdAuto() {
        return idAuto;
    }

    public String getModel() {
        return model;
    }

    public String getProducer() {
        return producer;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Auto auto = (Auto) o;
        return idAuto == auto.idAuto && Objects.equals(model, auto.model) && Objects.equals(producer, auto.producer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idAuto, model, producer);
    }

    @Override
    public String toString() {
        return "Auto { " +
                "idAuto : " + idAuto +
                ", model : '" + model + '\'' +
                ", producer : '" + producer + '\'' +
                " } ";
    }
}
