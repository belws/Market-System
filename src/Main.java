import itemUtils.Item;
import itemUtils.ItemCategory;
import itemUtils.ItemStack;

public class Main {
    public static void main(String[] args) {
        // Testing my constructors for invariants.
        ItemStack appleStack = new ItemStack(new Item ("Apple", ItemCategory.FOOD), 16);
        ItemStack otherStackOfApples = new ItemStack(new Item("Apple",ItemCategory.FOOD), 48);

        System.out.println(appleStack.equals(otherStackOfApples));
    }
}