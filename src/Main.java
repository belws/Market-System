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

        After discussing if I should create a Player class and continue with HashSet players,
        ChatGPT recommanded I should use my current Item class instead.

            New assignment: Create two Item objects representing the same item.
         */
        Item apple = new Item("Apple", ItemCategory.FOOD);
        Item anotherApple = new Item("Apple", ItemCategory.FOOD);

        /*
        ChatGPT asked me what happens here if HashSet <Item> items has two add() calls for both Item objects.
            I answered
                "well i dont really have enough to go on.
                although since our generic is Item i will guess it uses our overridden equals().
                still they could relay on hashCode and i have no idea what that is yet.
                but my final answer is two entries."

            Then ChatGPT said this:
            "Right now, because you've overridden equals() without properly overriding hashCode(),
                your Item class can violate that contract.
                That's why I'm not going to just explain hashCode() abstractly.
                We're going to learn it by seeing the problem happen."

                Assignment: create HashSet<Item> items and add both Item objects and print size
         */
        HashSet<Item> items = new HashSet<>();
        items.add(apple);
        items.add(anotherApple);
        System.out.println(items.size()); // Print = 2

    }
}