package prof.lessons._07_09_Lesson10.responseRequestModel;

import prof.lessons._07_09_Lesson10.responseRequestModel.repository.ProductRepository;
import prof.lessons._07_09_Lesson10.responseRequestModel.service.ProductService;
import prof.lessons._07_09_Lesson10.responseRequestModel.userInterface.Menu;

public class App {
    public static void main(String[] args) {
        ProductRepository repository = new ProductRepository();
        ProductService service = new ProductService(repository);
        Menu menu = new Menu(service);

       menu.menu();
    }
}
