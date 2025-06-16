package basic.homeWorks._06_12_Lesson22;

import basic.homeWorks._06_12_Lesson22.front.UserMenu;
import basic.homeWorks._06_12_Lesson22.repositiry.CatalogRepository;
import basic.homeWorks._06_12_Lesson22.service.ItemService;

public class Main {
    public static void main(String[] args) {
        int capacity = 15;
        CatalogRepository catalogRepository = new CatalogRepository(capacity);
        ItemService service = new ItemService(catalogRepository);
        UserMenu menu = new UserMenu(service);

        menu.start();
    }
}
