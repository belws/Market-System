import itemUtils.Item;
import itemUtils.ItemCategory;
import itemUtils.ItemStack;

public class Main {
    public static void main(String[] args) {
    // Testing my constructors for invariants.
    Item apple = new Item("Apple", ItemCategory.FOOD);
    Item otherApple = new Item("Apple", ItemCategory.FOOD);
    Item sword = new Item("Sword", ItemCategory.EQUIPMENT);
    ItemStack appleStack = new ItemStack(apple, 6);

    }
}