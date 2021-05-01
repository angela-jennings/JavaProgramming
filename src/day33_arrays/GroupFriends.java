package day33_arrays;
import java.util.*;
public class GroupFriends {
    public static void main(String[] args) {
        String [] pokemonEnemies = {"Jigglypuff", "Snorlax", "Ghastly", "Rattata", "Diglett", "Ditto", "Electrode", "Cubone", "Lickitung", "Chansey", "Tangela", "Scyther", "Jynx", "Magikarp", "Evee", "Zapdos", "Mewtwo", "Caterpie", "Weedle", "Pidgey", "Spearow", "Clefairy", "Vulpix", "Zubat", "Meowth", "Psyduck", "Growlithe", "Poliwag", "Tentacool", "Geodude", "Slowpoke", "Magnemite", "Doduo", "Onix", "Krabby", "Voltorb"  };
        String [] pokemonFriends = {"Pikachu", "Evil Squirtle", "Charmander", "Bulbasaur" };
        Random r = new Random();
        int randomPokemonEnemy = r.nextInt(pokemonEnemies.length);
        System.out.println("A wild " + pokemonEnemies[randomPokemonEnemy] + " appears!");
        System.out.println();
        int randomPokemon = r.nextInt(pokemonFriends.length);
        System.out.println("I choose you " + pokemonFriends[randomPokemon] + "!");



        System.out.println();
        String[] friends = {"Sarah", "Kayla", "Hubby", "Poppy", "Athena", "Koga"};
        for(int i = 0; i < friends.length; i++){
            System.out.println("Happy Holidays " + friends[i] + "!"); //long way
        }

        System.out.println();
        for(String each : friends){
            System.out.println("Happy Holidays " + each + "!");
        }
        System.out.println();
        String reverseFriends = "";
        for(int i = friends.length-1; i>=0; i--){
            reverseFriends = friends[i];
            System.out.println("Happy Christmas Harry " + reverseFriends + "!" );
        }


    }
}
