package prof.lessons._07_09_Lesson10.responseRequestModel2;

import prof.lessons._07_09_Lesson10.responseRequestModel2.repository.ProductRepository;
import prof.lessons._07_09_Lesson10.responseRequestModel2.service.ProductService;
import prof.lessons._07_09_Lesson10.responseRequestModel2.userInterface.Menu;

public class App {
    public static void main(String[] args) {
        ProductRepository repository = new ProductRepository();
        ProductService service = new ProductService(repository);
        Menu menu = new Menu(service);

       menu.menu();
    }
}
