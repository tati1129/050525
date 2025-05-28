package _05_27.task5;

import _05_27.UserInputStatic;

public class UserRegistrationOldStyle {
    public static void main(String[] args) {
        /*
        Мы пишем код для регистрации пользователя и запрашиваем у него данные:
        - username
        - passord
        - email
        - description

        Используя введенные данные - создать объект для их хранения

        Перед созданием экземпляра класса необходимо произвести проверку
        (валидацию) полученных данных:
        - имя пользователя не может быть пустым и не короче 3х символов
        - пароль не пустой и его длина от 8 символов и больше
        - email не пустой и обязательно содержит символ '@' и '.' причем '@' должен быть раньше
        - длина description не более 25 символов
         */

        String username = UserInputStatic.inputString("Ведите имя пользователя");
        String password = UserInputStatic.inputString("Ведите password");
        String email = UserInputStatic.inputString("Ведите email");
        String description = UserInputStatic.inputString("Ведите имя пользователя");

        User user = new User(username,password,email,description);
    }
}
