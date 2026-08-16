import inventory.Inventory;
import itemUtils.Item;
import itemUtils.ItemCategory;
import itemUtils.ItemStack;

public class Main {
    public static void main(String[] args) {
        // Testing my constructors for invariants.
        Item apple = new Item ("Apple", ItemCategory.FOOD);
        Inventory inventory = new Inventory();
    }
}