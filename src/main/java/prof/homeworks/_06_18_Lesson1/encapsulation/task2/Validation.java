package prof.homeworks._06_18_Lesson1.encapsulation.task2;

public class Validation {
public boolean isValidPassword(String password){
    if (password.length() < 8){
        return false;
    }

    int upper = 0;
    int lower = 0;
    int digits = 0;
    int special = 0;

    for (char ch : password.toCharArray()) {
        if (Character.isUpperCase(ch)) upper++;
        else if (Character.isLowerCase(ch)) lower++;
        else if (Character.isDigit(ch)) digits++;
        else special++;
    }
    return (upper>=2 && lower>=2 && digits >=3 && special >=1);
}

}
