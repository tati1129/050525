package basic._06_16_Lesson23.ssed;

public class ProductService {

    private ProductRepository repository;
    private ValidationService validationService;

    public ProductService(ProductRepository repository, ValidationService validationService) {
        this.repository = repository;
        this.validationService = validationService;
    }

    public String add(int id, String category, String brand, String productName) {

        if (validationService.validate(id, category, brand, productName)) {
            Product newProduct = new Product(id, category, brand, productName);
            repository.save(newProduct);
            return newProduct.toString();
        } else {
            return "Параметры продукта не соответствуют заданным критериям";
        }
    }

    public String getproductId(int idForSearch) {
        Product foundedProduct = repository.findId(idForSearch);
        if (foundedProduct == null) {
            return "Товар с id = " + idForSearch + " не найден";
        }
        return foundedProduct.toString();
    }
}
