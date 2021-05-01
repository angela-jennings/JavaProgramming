package extra_tasks;

public class MovieTask {
    public static void main (String[] args) {
    String movie = "Evil Dead 2";
    String genre = "Action";
    byte duration = 84;
    String releaseDate = "March 13, 1987";
    char rating = 82;
    boolean sequel = true;
    byte rottenTomatoRating = 95;
    boolean dvd = true;

    System.out.println("Tonight we are streaming " + movie + " which was released on " + releaseDate + ". \nThis " +
            genre + " movie received a rating of " + rottenTomatoRating + " on Rotten Tomatoes. \nThe movie has a rating of " + rating + " and has a run time of " + duration + " minutes. " +'\n' + "Is this movie a sequel: " + sequel + '\n' + "Is this available on dvd: " + dvd);

    }
}
