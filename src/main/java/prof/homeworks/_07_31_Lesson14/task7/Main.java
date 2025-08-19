package prof.homeworks._07_31_Lesson14.task7;

import java.util.Comparator;
import java.util.List;

/*
Дана коллекция Product - название, категория, цена, количество на складе.
   Найти среднюю цену продуктов каждой категории, у которых количество превышает заданное значение
   и отсортировать по убыванию цены
 */
public class Main {
    public static void main(String[] args) {
        ProductService service = new ProductService();
List<Category> categories = fiteredByAVGPriceAndSortedDescByPrice(service.categories, 40);
        System.out.println("Category of products filtered by priceAVG and quantity and sorted ba price desc");
        for (Category c : categories){
            System.out.println(c);
        }

    }

    public static List<Category> fiteredByAVGPriceAndSortedDescByPrice(List<Category> categories,int quantity){
       return categories.stream()
                .filter(c -> c.getProducts().stream()
                        .mapToInt(p -> p.getQuantity()).sum() > quantity)
                .sorted(Comparator.comparingDouble(Category::getPriceAvg).reversed())
               .toList();
    }
}
