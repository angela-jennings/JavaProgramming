package day50_inheritance;

public class EBook extends Book{
    int dataSize;
    int pages;

    public void readBook(){
        System.out.println("You are reading " + title + "\nAuthor: " + author + "\nGenre: " + genre + "\nPrice: $" + price + "\nData Size: " + dataSize + "MB" + "\nPages: " + pages);
    }
}
