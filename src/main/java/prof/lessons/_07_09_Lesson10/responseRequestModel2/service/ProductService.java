package prof.lessons._07_09_Lesson10.responseRequestModel2.service;

import prof.lessons._07_09_Lesson10.responseRequestModel2.dto.ProductRequestDto;
import prof.lessons._07_09_Lesson10.responseRequestModel2.dto.ProductResponseDto;
import prof.lessons._07_09_Lesson10.responseRequestModel2.entity.Product;
import prof.lessons._07_09_Lesson10.responseRequestModel2.repository.ProductRepository;

import java.util.List;
import java.util.Optional;

public class ProductService {
    private ProductRepository repository;


    public ProductService(ProductRepository repository) {
        this.repository = repository;
    }


    public ProductResponseDto addNewProduct(ProductRequestDto request) {
        String validationMessage = validation(request);
        if (!validationMessage.isBlank()) {
            return new ProductResponseDto(false, validationMessage);
        }

        Product newProduct = new Product(
                0,
                request.getProductName(),
                request.getPrice(),
                request.getDescription()
        );
        Product savedProduct = repository.addProduct(newProduct);

        return new ProductResponseDto(true, savedProduct.toString());
    }


    private String validation(ProductRequestDto request) {

        String message = "";
        if (request.getPrice() < 0) message = message +  "Цена должна быть больше 0" + "\n";
        if (request.getProductName().isBlank())  message = message +  "Поле наименования не должно быть пустым" + "\n";
        if (request.getDescription().isBlank()) message = message +  "Поле опи сания товара не должно быть пустым" + "\n";
        if (request.getProductName().length() > 15) message = message +   "Наименование товара не должно быть превышать 15 символов" + "\n";
        if (request.getProductName().length() < 3)  message = message +   "Наименование товара должно быть длиннее 3х символов" + "\n";

        return message;

    }


    public List<Product> findAll() {
        List<Product> allProduct = repository.findAll();
        return allProduct;
    }

    public ProductResponseDto findById(Integer id) {
        Optional<Product> foundOptProduct = repository.findById(id);

        if (foundOptProduct.isPresent()) {
            Product foundProduct = foundOptProduct.get();
            return new ProductResponseDto(true, foundProduct.toString());
        } else {
            return new ProductResponseDto(false,"Товар с id = " + id + " не найден");
        }
    }
}
