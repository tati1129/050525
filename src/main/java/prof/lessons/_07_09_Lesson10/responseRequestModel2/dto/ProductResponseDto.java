package prof.lessons._07_09_Lesson10.responseRequestModel2.dto;

public class ProductResponseDto {
    private boolean result;
    private String message;

    public ProductResponseDto(boolean result, String message) {
        this.result = result;
        this.message = message;
    }

    public boolean isResult() {
        return result;
    }

    public String getMessage() {
        return message;
    }
}
