import users.User;

public class Main {
    public static void main(String[] args) {
        User user1 = new User.UserBuilder("Hakim","Maha").age(20).build();
        System.out.println(user1);
    }
}