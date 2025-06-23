package prof.homeworks._06_18_Lesson1.encapsulation.task2;

public class Main {
    public static void main(String[] args) {
        User user = new User("Ann", "AnnS123&", "kfkWdllöa");
        Validation validation = new Validation();
        UserService service = new UserService(user,validation);


        service.changePassword("saöjg","AsaadnS123&");
        service.changePassword("AnnS123&","AnnSmith111!");

    }
}
