package day52_inheritance.discord_users;

public class Admin extends User {

    public Admin() {
        super(); //call super class/User class no-args constructor
        System.out.println("Admin class constructor");
    }
    public Admin(String name, int id){
        super("Admin", name, id);
        System.out.println("Admin class 2 args constructor");
    }
    @Override
    public String toString() {
        return "Admin{" +
                "userRole='" + getUserRole() + '\'' +
                ", name='" + getName() + '\'' +
                ", id=" + getId() +
                '}';
    }
}
