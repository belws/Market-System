import inventory.Inventory;
import itemUtils.Item;
import itemUtils.ItemCategory;
import itemUtils.ItemStack;

public class Main {
    public static void main(String[] args) {
        // Testing my constructors for invariants.
        Item apple = new Item ("Apple", ItemCategory.FOOD);
        ItemStack appleStack = new ItemStack(apple, 16);
        ItemStack otherStackOfApples = new ItemStack(apple, 48);
        Inventory inventory = new Inventory();
    }
}