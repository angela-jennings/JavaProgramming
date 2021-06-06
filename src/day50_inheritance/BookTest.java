package day50_inheritance;

public class BookTest {
    public static void main(String[] args) {
        Book book1 = new Book();
        book1.title = "Harry Potter and The Sorcerer's Stone";
        book1.genre = "Fantasy";
        book1.author = "J.K. Rowling";
        book1.price = 19.99;

        AudioBook book2 = new AudioBook();
        book2.title = "Harry Potter and The Chamber of Secrets";
        book2.timeLengthMinutes = 253;
        book2.narrator = "An English Man";
        book2.listen();

        EBook book3 = new EBook();
        book3.title = "Harry Potter and The Prisoner of Azkaban";
        book3.author = "J.K. Rowling";
        book3.genre = "Fantasy";
        book3.price = 19.99;
        book3.pages = 864;
        book3.dataSize = 25;
        book3.readBook();

    }
}
