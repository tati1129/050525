package homeWorks._05_13_Lesson8.items;

public class ShopDemo {
    public static void main(String[] args) {

        Shop shop = new Shop(1000,500);

        shop.discount = 100;

        double result = shop.getTotalPrice(shop.priceA, shop.priceB, shop.discount);
        System.out.println("Total price is : " + result);

        shop.printOrder(result);
    }
}
