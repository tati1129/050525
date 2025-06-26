package prof.lessons._06_23_Lesson3.arrayWithoutInterfaces;

public class Sklad {
    private Device[] devices;

    public Sklad(Device[] devices) {
        this.devices = devices;
    }

    public void fiilSklad() {
        Computer computer1 = new Computer("MacBook", "MacBook Pro M4", 16, "M4");
        Computer computer2 = new Computer("ASUS", "Asus computer", 15, "i5");
        Computer computer3 = new Computer("ACER", "ACER COMPUTER", 17, "i7");

        TV tv1 = new TV("LG", "LG 3401", 34, "LED");
        TV tv2 = new TV("SONY", "SONY 57", 57, "OLED");
        TV tv3 = new TV("LG", "LG 8901", 89, "QLED");

        devices[0] = computer1;
        devices[1] = computer2;
        devices[2] = computer3;
        devices[3] = tv1;
        devices[4] = tv2;
        devices[5] = tv3;
    }
    public Device[] findByName(String searchName){
        Device[] foundedDevice = new Device[devices.length];
int indexCounter = 0;
        for (int i = 0; i < devices.length; i++) {
            if (devices[i].getModel().contains(searchName)){
                foundedDevice[indexCounter++] = devices[i];
            }

        }
        Device[] devicesForReturn = new Device[indexCounter];
        for (int i = 0; i < devicesForReturn.length; i++) {
            foundedDevice[i] = devicesForReturn[i];
        }
        return  devicesForReturn;
    }
}
