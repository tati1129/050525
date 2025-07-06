package prof.lessons._06_30_Lesson6.hasnSet.setWithObject;

import java.util.Objects;

public class Car {
    private Integer id;
    private String producer;
    private String model;

    public Car(Integer id, String producer, String model) {
        this.id = id;
        this.producer = producer;
        this.model = model;
    }

    public Integer getId() {
        return id;
    }

    public String getProducer() {
        return producer;
    }

    public String getModel() {
        return model;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Car car)) return false;
        return Objects.equals(producer, car.producer) && Objects.equals(model, car.model);
    }


    @Override
    public int hashCode() {
        return Objects.hash(producer, model);

    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", producer='" + producer + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
