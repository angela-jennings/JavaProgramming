package day52_inheritance.discord_users;

public class User {
    private String userRole;
    private String name;
    private int id;

    public User() {
        System.out.println("User class constructor");
    }

    public User(String userRole, String name, int id) {
        System.out.println("user class 3 args constructor");
        this.userRole = userRole;
        this.name = name;
        this.id = id;
    }

    public String getUserRole() {
        return userRole;
    }

    public void setUserRole(String userRole) {
        this.userRole = userRole;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "User{" +
                "userRole='" + userRole + '\'' +
                ", name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
