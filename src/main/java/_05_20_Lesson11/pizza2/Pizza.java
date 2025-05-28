package _05_20_Lesson11.pizza2;

public class Pizza {
    private double diametr;
    private double caloriesInSm;

    public Pizza(double diametr, double caloriesInSm) {
        this.diametr = diametr;
        this.caloriesInSm = caloriesInSm;
    }

    public double getDiametr() {
        return diametr;
    }

    public double getCaloriesInSm() {
        return caloriesInSm;
    }
}
