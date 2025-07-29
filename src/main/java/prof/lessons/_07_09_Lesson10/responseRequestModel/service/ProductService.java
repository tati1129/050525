package prof.lessons._07_09_Lesson10.responseRequestModel.service;

import prof.lessons._07_09_Lesson10.responseRequestModel.entity.Product;
import prof.lessons._07_09_Lesson10.responseRequestModel.repository.ProductRepository;

import java.util.List;
import java.util.Optional;

public class ProductService {
    private ProductRepository repository;

    public ProductService(ProductRepository repository) {
        this.repository = repository;
    }



    public boolean addNewProduct(Integer id, String productName, Double price, String description) {
        if (!validation(id, productName, price, description)) {
            return false;
        }

        Product newProduct = new Product(id, productName, price, description);
        return repository.addProduct(newProduct);
    }


    private boolean validation(Integer id, String productName, Double price, String description) {
        if (id <= 0) return false;
        if (price < 0) return false;
        if (productName.isBlank()) return false;
        if (description.isBlank()) return false;
        if (productName.length() > 15) return false;
        if (productName.length() < 3) return false;

        return true;

    }


    public List<Product> findAll(){
        List<Product> allProduct = repository.findAll();
        return allProduct;
    }

    public String findById(Integer id){
        Optional<Product> foundOptProduct = repository.findById(id);

        if (foundOptProduct.isPresent()){
            Product foundProduct = foundOptProduct.get();
            return foundProduct.toString();
        }else {
            return "Товар с id = "+ id+" не найден";
        }
    }
}
