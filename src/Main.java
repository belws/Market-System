import itemUtils.Item;
import itemUtils.ItemCategory;
import itemUtils.ItemStack;

public class Main {
    public static void main(String[] args) {
    // Testing my constructors for invariants.
    Item apple = new Item("Apple", ItemCategory.FOOD);
    ItemStack appleStack = new ItemStack(apple, 0);//Changed this back from null since im done testing.

    }
}