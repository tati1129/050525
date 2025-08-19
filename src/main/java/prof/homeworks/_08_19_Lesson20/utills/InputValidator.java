package prof.homeworks._08_19_Lesson20.utills;

public class InputValidator {
    public static boolean isValidCountryCode(String code){
        return code !=null && code.matches("\\+?\\d{1,4}");
    }

    public static boolean isValidNumber(String code){
        return code != null && code.matches("([\\d]\\s?){9,10}");
    }
}
