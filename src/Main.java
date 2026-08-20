import itemUtils.Item;
import itemUtils.ItemCategory;
import itemUtils.ItemStack;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        Here we go again :)
        Today's lesson is HashMap and from what I gathered so far this represents the relationship between a key and a value.

        HashMap<String, Integer> items = new HashMap<>();

        //1 Put "Apple" → 50
        items.put("Apple", 50);
        //2 Put "Diamond" → 12
        items.put("Diamond", 12);
        //3 Put "Iron" → 64
        items.put("Iron", 64);
        //4 Print the value associated with "Diamond"
        System.out.println(items.get("Diamond"));
        //5 Change "Diamond" to 20
        items.put("Diamond", 20);
        //6 Print the value associated with "Diamond" again
        System.out.println(items.get("Diamond"));
        //7 Print the size of the map
        System.out.println(items.size());

        /*Using your HashMap<String, Integer> items, figure out how to:
            check whether a key exists
            check whether a value exists
            remove a key/value pair

        System.out.println(items.containsKey("Apple"));
        System.out.println(items.containsValue(64));
        items.remove("Diamond");


        //Now I will use HashMap with objects
        Item apple = new Item("Apple", ItemCategory.FOOD);
        Item anotherApple = new Item("Apple", ItemCategory.FOOD);
        HashMap<Item, Integer> inventory =  new HashMap<>();
        // New assignment: check if 2 equal objects with the same HashCode are the same key
        inventory.put(apple,50);
        System.out.println(inventory.get(anotherApple));

        //Testing with a null key
        System.out.println(inventory.size());
        System.out.println(inventory.getOrDefault(new Item("Bread", ItemCategory.FOOD), 0));
        System.out.println(inventory.size());

        getOrDefault will return that value for the search but will not add the key to the map.
         */


        /* The next assignment is to mix HashSet with HashMap and make a mini system that uses both
            My fist idea is to make a HashSet with called 'achievements' ,
            then collecting enough of an item contained in a HashMap <Item, Integer> questItems
            should print my achievements.
         */
        Item apple = new Item("Apple", ItemCategory.FOOD);
        HashSet<Achievements> achievements = new HashSet<>();
        achievements.add(Achievements.GETTING_STARTED);
        achievements.add(Achievements.WAY_TO_GO);
        achievements.add(Achievements.MASTERFUL_COLLECTION);

        HashMap<Item, Integer> questItem = new HashMap<>();

        }
        void addApples(){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter how many Apples you found");
            int foundApples = scanner.nextInt();
            // I think we might need a getter and setter here

    }
}