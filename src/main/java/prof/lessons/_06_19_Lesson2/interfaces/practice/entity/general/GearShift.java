package prof.lessons._06_19_Lesson2.interfaces.practice.entity.general;

public class GearShift {
    private String transmissionParametrs;
    private  Integer currentGear;

    public GearShift(String transmissionParametrsr) {
        this.transmissionParametrs = transmissionParametrs;
    }

    public String getTransmissionParametrs() {
        return transmissionParametrs;
    }

    public Integer getCurrentGear() {
        return currentGear;
    }

    public void changeGear(Integer currentGear) {
        this.currentGear = currentGear;
    }
}
