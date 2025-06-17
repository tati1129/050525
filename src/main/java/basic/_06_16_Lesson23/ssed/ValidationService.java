package basic._06_16_Lesson23.ssed;

public class ValidationService {
    public boolean validate(int id, String category, String brand, String productName){

        if (id == 0)return false;
        if (category.isBlank())return false;
        if (brand.isBlank())return false;
        if (productName.isBlank()) return false;

        return true;
    }
}
