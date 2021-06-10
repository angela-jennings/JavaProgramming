package day51_inheritance.super_keyword;

public class LyftRides {
    public static void main(String[] args) {
        Lyft lyftRide = new Lyft();
        System.out.println("ride.calculateRate(8.5) = " + lyftRide.calculateRate(8.5));
        LyftXL lyftXLRide = new LyftXL();
        System.out.println("lyftXLRide.calculateRate(8.5) = " + lyftXLRide.calculateRate(8.5));
        LyftLux luxRide = new LyftLux();
        System.out.println("luxRide.calculateRate(8.5) = " + luxRide.calculateRate(8.5));

    }
}
