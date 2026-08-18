import itemUtils.Item;
import itemUtils.ItemCategory;
import itemUtils.ItemStack;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
/*
        I started the HashSet lesson here.
        From what I covered so far, using my own words to describe a HashSet:
            A HashSet is a collection of unique objects.
            I will later cover more about equals and hashCode.

        Then my first assignment was to make a program that does the following
 */
        //1 Creates a HashSet<String> called players
        HashSet<String> players = new HashSet<>();
        //2 Adds "Steve"
        players.add("Steve");
        //3 Adds "Alex"
        players.add("Alex");
        //4 Adds "Steve" again
        players.add("Steve");
        //5 Adds "Notch"
        players.add("Notch");
        //6 Prints the size
        System.out.println(players.size());
        //7 Checks whether "Alex" exists
        System.out.println(players.contains("Alex"));
        //8 Removes "Alex"
        players.remove("Alex");
        //9 Checks whether "Alex" exists again
        System.out.println(players.contains("Alex"));

    }
}