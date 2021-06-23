package day56_abstraction.greeting_interface;

public class HelloGoodbye {
    public static void main(String[] args) {
        English english = new English();
        english.hi();
        english.bye();

        Greeting sp = new Spanish();
        sp.hi();
        sp.bye();
    }
}
