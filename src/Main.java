import itemUtils.Item;
import itemUtils.ItemCategory;
import itemUtils.ItemStack;

import java.util.HashMap;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        /*
        Here we go again :)
        Today's lesson is HashMap and from what I gathered so far this represents the relationship between a key and a value.
         */
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
            remove a key/value pair */

        System.out.println(items.containsKey("Apple"));
        System.out.println(items.containsValue(64));
        items.remove("Diamond");

    }
}