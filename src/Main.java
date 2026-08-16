import inventory.Inventory;
import itemUtils.Item;
import itemUtils.ItemCategory;
import itemUtils.ItemStack;

public class Main {
    public static void main(String[] args) {
        // Testing my constructors for invariants.
        Item apple = new Item ("Apple", ItemCategory.FOOD);
        Inventory inventory = new Inventory();
        inventory.addItem(apple, 1);
        inventory.getContent();
        inventory.addItem(apple, 1);
        inventory.getContent();
        inventory.addItem(apple, 0);
        inventory.getContent();
        inventory.addItem(apple, -1);
        inventory.getContent();
        inventory.addItem(new Item("Sword", ItemCategory.EQUIPMENT), 1);
        inventory.getContent();

    }
}