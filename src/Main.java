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

        System.out.println(appleStack.hasItem(apple)); //True
        System.out.println(appleStack.hasItem(otherApple));//True
        System.out.println(appleStack.hasItem(sword));//False

        System.out.println(appleStack.getQuantity());//6
        appleStack.addItem(apple, 3);
        System.out.println(appleStack.getQuantity());//9
        appleStack.addItem(sword, 1);//You cannot add that item to this stack!
        System.out.println(appleStack.getQuantity());//9
        appleStack.addItem(apple, -1);//Quantity must be positive
        System.out.println(appleStack.getQuantity());//9

    }
}