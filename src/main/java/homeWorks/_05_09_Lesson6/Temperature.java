package homeWorks._05_09_Lesson6;

public class Temperature {
    int monday = 11;
    int tuesday = 13;
    int wednesday = 12;
    int thursday = 8;
    int friday = 14;
    int saturday = 16;
    int sunday = 18;

    public void avgTemperature(){
      int result =  (monday + tuesday +wednesday + thursday + friday + saturday + sunday)/7;
        System.out.println("Average temperature for a week is : " + result);
    }
}
