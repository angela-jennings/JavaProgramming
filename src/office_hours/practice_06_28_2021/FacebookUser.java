package office_hours.practice_06_28_2021;

import java.time.LocalTime;
import java.util.ArrayList;

public class FacebookUser extends SocialMedia implements Groups {
    private String username;
    private String password;
    private String fullName;
    private int age;
    private int numOfFriends;
    private ArrayList <Post>  allPosts;
    private int numOfGroups;

    static {
        platform = "Facebook";
    }
    public FacebookUser(String username, String password){
        this.username = username;
        setPassword(password);
        personUrl = "facebook.com/" + username;
        allPosts = new ArrayList<>();
    }
    public FacebookUser(String username, String password, String fullName){
        this(username, password);
        setFullName(fullName);
    }
    public FacebookUser(String username, String password, String fullName, int age, int numOfFriends){
        this(username, password, fullName);
        setAge(age);
        setNumOfFriends(numOfFriends);
    }

    public int getNumOfGroups() {
        return numOfGroups;
    }

    public void setNumOfGroups(int numOfGroups) {
        this.numOfGroups = numOfGroups;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if(password.contains(this.username)){
            System.out.println("Password contained username");
            this.password = "password";
        }else{
            this.password = password;
        }
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        boolean validName = true;

        for(int i = 0; i < fullName.length(); i++){

            if(fullName.charAt(i) == ' ') continue;

            if(!Character.isLetter(fullName.charAt(i))){
                validName = false;
                break;
            }
        }

        if(validName){
            this.fullName = fullName;
        } else{
            System.out.println("Invalid name");
            this.fullName = "no name";
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age > 0){
            this.age = age;
        }else{
            System.out.println("Invalid age");
        }
    }

    public int getNumOfFriends() {
        return numOfFriends;
    }

    public void setNumOfFriends(int numOfFriends) {
        if(this.numOfFriends < 5000){
            this.numOfFriends = numOfFriends;
        }else{
            System.out.println("Invalid number of friends");
        }
    }

    public ArrayList<Post> getAllPosts() {
        return allPosts;
    }

    public void setAllPosts(ArrayList<Post> allPosts) {
        this.allPosts = allPosts;
    }

    @Override
    public void directMessage(String username, String message) {
        System.out.println(message + " was sent to " + username);
    }

    @Override
    public void post(String body) {
        allPosts.add(new Post(body));
    }

    @Override
    public void notifications() {
    int currentHour = LocalTime.now().getHour();
    if(currentHour >= 8 && currentHour <= 17){
        System.out.println("Notification");
    }else{
        System.out.println("Sleep Mode");
    }
    }

    public boolean sendFriendRequest(FacebookUser other){
        boolean sent = false;

        if(this.getNumOfFriends() < 5000 && other.getNumOfFriends() < 5000){
            System.out.println("Friend request sent to " + other.getUsername());
            sent = true;
            this.setNumOfFriends(this.getNumOfFriends() + 1);
            other.setNumOfFriends(other.getNumOfFriends() + 1);
        }else if(this.getNumOfFriends() == 5000){
            System.out.println("You have reached the max limit of friends");
        }else{
            System.out.println(other.getUsername() + " cannot accept anymore friends");
        }
        return sent;
    }

    @Override
    public String toString() {
        return "FacebookUser{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", fullName='" + fullName + '\'' +
                ", age=" + age +
                ", numOfFriends=" + numOfFriends +
                ", allPosts=" + allPosts +
                '}';
    }

    @Override
    public void joinGroup(String groupName) {
        System.out.println(getUsername() + " has joined " + groupName);
        setNumOfGroups(getNumOfGroups() + 1);
    }

    @Override
    public void leaveGroup(String groupName) {
        System.out.println(getUsername() + " has left " + groupName);
        setNumOfGroups(getNumOfGroups() - 1);
    }
}
