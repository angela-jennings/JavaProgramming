package office_hours.practice_06_28_2021;

public class FacebookUserObjects {
    public static void main(String[] args) throws InterruptedException {
        FacebookUser user1 = new FacebookUser("athena", "123456");
        System.out.println(user1);

        FacebookUser user2 = new FacebookUser("koga", "456798", "Koga Jennings", 10, 50);
        System.out.println(user2);

        user1.sendFriendRequest(user2);
        System.out.println(user1);
        System.out.println(user2);

//        user1.post("This is my first post!");
//        Thread.sleep(10000);
//        user1.post("I like this app");
//        System.out.println(user1.getAllPosts());
    }
}
