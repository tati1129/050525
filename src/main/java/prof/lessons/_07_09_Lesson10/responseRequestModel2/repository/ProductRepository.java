package prof.lessons._07_09_Lesson10.responseRequestModel2.repository;

import prof.lessons._07_09_Lesson10.responseRequestModel2.entity.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ProductRepository {

    private List<Product> database;
    private int counter = 0;

    public ProductRepository() {
        this.database = new ArrayList<>();
    }

    public Product addProduct(Product newProduct){
        newProduct.setId(++counter);
    database.add(newProduct);
    return newProduct;
    }

    public List<Product> findAll(){
        return  database;
    }

    public Optional<Product> findById(Integer id){
        for (Product currentProduct : database){
            if (currentProduct.getId().equals(id)){
                return Optional.of(currentProduct);
            }
        }
        return Optional.empty();
    }
}
