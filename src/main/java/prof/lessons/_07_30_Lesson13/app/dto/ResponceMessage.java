package prof.lessons._07_30_Lesson13.app.dto;

public class ResponceMessage <T> {
    private int responseCode;
    private T body;
    private String message;

    public ResponceMessage(int responseCode, T body, String massage) {
        this.responseCode = responseCode;
        this.body = body;
        this.message = massage;
    }

    public int getResponseCode() {
        return responseCode;
    }

    public T getBody() {
        return body;
    }

    public String getMessage() {
        return message;
    }
}
