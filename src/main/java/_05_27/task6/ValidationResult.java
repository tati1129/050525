package _05_27.task6;

public class ValidationResult {
    private int codeError;
    private String errorDescription;

    public ValidationResult(int codeError, String errorDescription) {
     ;

        this.codeError = codeError;
        this.errorDescription = errorDescription;
    }

    public int getCodeError() {
        return codeError;
    }

    public String getErrorDescription() {
        return errorDescription;
    }
}
