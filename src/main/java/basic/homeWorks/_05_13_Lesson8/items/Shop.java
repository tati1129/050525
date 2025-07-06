package basic.homeWorks._05_13_Lesson8.items;

public class Shop {
    double priceA;
    double priceB;
    double discount;

    public Shop(double priceA, double priceB) {
        this.priceA = priceA;
        this.priceB = priceB;
    }

    public Shop(double priceA, double priceB, double discount) {
        this.priceA = priceA;
        this.priceB = priceB;
        this.discount = discount;
    }

    public double getTotalPrice(double priceA, double priceB, double discount) {
        double result = (priceA + priceB) - discount;
        return result;
    }

    public void printOrder(double quantity) {
        System.out.println("Your purchase items : ");
        System.out.println("        item 1 : " + priceA);
        System.out.println("        item 2 : " + priceB);
        System.out.println("        discount is : " + discount);
        System.out.println("The total amount of your purchase is : " + quantity);

    }
}
