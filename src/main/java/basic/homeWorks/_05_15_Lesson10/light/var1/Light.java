package basic.homeWorks._05_15_Lesson10.light.var1;

public class Light {
    private String location;

    private int brightness;

    private String isOn;

    public Light(String location, int brightness,String isOn) {
        this.location = location;
        this.brightness = brightness;
        this.isOn = isOn;
    }

    public void setBrightness(int brightness) {
        this.brightness = brightness;
    }

    public void setOn(String on) {
        isOn = on;
    }

    public String getLocation() {
        return location;
    }

    public int getBrightness() {
        return brightness;
    }

    public String isOn() {
        return isOn;
    }

    @Override
    public String toString() {
        return "Light{" +
                "location='" + location + '\'' +
                ", brightness=" + brightness +
                ", isOn=" + isOn +
                '}';
    }

}
