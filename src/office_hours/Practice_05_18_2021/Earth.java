package office_hours.Practice_05_18_2021;

public class Earth {
    public static void main(String[] args) {
        AnimalSpecies dogs = new AnimalSpecies();
        dogs.setInfo("dergs", 50, 10);
        System.out.println(dogs.getName());
        System.out.println(dogs);

        AnimalSpecies cats = new AnimalSpecies();
        cats.setInfo("kitties", 100, 15);
        System.out.println(cats);

        AnimalSpecies birbs = new AnimalSpecies();
        birbs.setInfo("birbs", 75, 25);
        System.out.println(birbs);
    }
}
