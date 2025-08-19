package prof.homeworks._07_31_Lesson14.task7;

import java.util.ArrayList;
import java.util.List;

public class ProductService {
    List<Product> products = new ArrayList<>();
    List<Category> categories = new ArrayList<>();
    Category fruitsLocal = new Category("fruitsLocal");
    Category fruitsImport = new Category("fruitsImport");
    Category vegetables =  new Category("vegetables");

    Product product1 = new Product("apple", fruitsLocal,25.3,40);
    Product product2 = new Product("peach",fruitsLocal, 27.2,20);
    Product product3 = new Product("plum", fruitsLocal,20.6,50);
    Product product4 = new Product("banana",fruitsImport, 13.3,100);
    Product product5 = new Product("ananas",fruitsImport, 40.2,30);
    Product product6 = new Product("orange", fruitsImport,14.7,75);
    Product product7 = new Product("tomato",vegetables, 9.9,68);
    Product product8 = new Product("cucumber", vegetables,8.2,49);
    Product product9 = new Product("zuccini", vegetables,7.8,37);

    public ProductService(){
        categories.add(fruitsLocal);
        categories.add(fruitsImport);
        categories.add(vegetables);

        products.add(product1);
        products.add(product2);
        products.add(product3);
        products.add(product4);
        products.add(product5);
        products.add(product6);
        products.add(product7);
        products.add(product8);
        products.add(product9);

        fruitsLocal.addProduct(product1);
        fruitsLocal.addProduct(product2);
        fruitsLocal.addProduct(product3);

        fruitsImport.addProduct(product4);
        fruitsImport.addProduct(product5);
        fruitsImport.addProduct(product6);
        vegetables.addProduct(product7);
        vegetables.addProduct(product8);
        vegetables.addProduct(product9);

    }
}
