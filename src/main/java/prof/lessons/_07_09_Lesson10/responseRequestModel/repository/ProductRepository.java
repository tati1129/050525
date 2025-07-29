package prof.lessons._07_09_Lesson10.responseRequestModel.repository;

import prof.lessons._07_09_Lesson10.responseRequestModel.entity.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ProductRepository {

    private List<Product> database;

    public ProductRepository() {
        this.database = new ArrayList<>();
    }

    public  boolean addProduct(Product newProduct){
        return database.add(newProduct);
    }

    public List<Product> findAll(){
        return  database;
    }

    public Optional<Product> findById(Integer id){
        for (Product currentProduct : database){
            if (currentProduct.getId() ==id){
                return Optional.of(currentProduct);
            }
        }
        return Optional.empty();
    }
}
