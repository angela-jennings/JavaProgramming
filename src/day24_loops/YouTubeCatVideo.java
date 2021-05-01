package day24_loops;

public class YouTubeCatVideo {
    public static void main(String[] args) throws InterruptedException {
        int seconds = 0;
        while(seconds <117){
            seconds++;
            Thread.sleep(1000); //pause the code execution for 1000 milliseconds (1 second)
            System.out.println("watching youtube video: second: " + seconds );
        }
        System.out.println("you tube video is over. would you like to restart?\uD83D\uDC31\uD83D\uDD25\uD83C\uDFC4\uD83E\uDD51");

        }

    }

