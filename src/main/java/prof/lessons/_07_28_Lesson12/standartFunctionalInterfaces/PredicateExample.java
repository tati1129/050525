package prof.lessons._07_28_Lesson12.standartFunctionalInterfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {
        List<UserRole> users = new ArrayList<>();

        users.add(new UserRole("Alex","admin"));
        users.add(new UserRole("Thea","member"));
        users.add(new UserRole("Alex2","admin"));
        users.add(new UserRole("Alex3","admin"));
        users.add(new UserRole("Alex4","admin"));
        users.add(new UserRole("Alex5","member"));


        // ----- сделаем выборку всех user с ролью admin

        // ------ old school classic OOP -------

        System.out.println(findByRole(users,"admin"));

        // ----- то же самое, но с помощью стандартного ФИ predicate
        List<UserRole> admins = findProcess(users, (UserRole user) ->user.getRole().equals("admin"));
        List<UserRole> userNameThea = findProcess(users, (UserRole user) ->user.getName().contains("Thea"));

    }


    public static List<UserRole> findByRole(List<UserRole> users, String role){
        List<UserRole> foundedeUsers = new ArrayList<>();

        for (UserRole user : users){
            if (user.getRole().equals(role)){
                foundedeUsers.add(user);
            }
        }
        return foundedeUsers;
    }
    public static List<UserRole> findProcess(List<UserRole> users, Predicate<UserRole> predicate){
        List<UserRole> foundedeUsers = new ArrayList<>();

        for (UserRole user : users){
            if (predicate.test(user)){
                foundedeUsers.add(user);
            }
        }
        return foundedeUsers;
    }

}
