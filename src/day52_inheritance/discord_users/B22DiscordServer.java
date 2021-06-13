package day52_inheritance.discord_users;

public class B22DiscordServer {
    public static void main(String[] args) {
        User user1  = new User();
        user1.setName("Angela");
        user1.setUserRole("Student");
        user1.setId(123456);

        Admin admin1 = new Admin();
        admin1.setId(456789);
        admin1.setName("Koga");
        admin1.setUserRole("Admin");

        System.out.println(user1);
        System.out.println(admin1);
    }
}
