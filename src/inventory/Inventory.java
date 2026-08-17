package inventory;

import itemUtils.Item;
import itemUtils.ItemStack;

import java.util.ArrayList;

public class Inventory {
    ArrayList<ItemStack> inventory = new ArrayList<>();
    ItemStack itemStack;

    public Inventory(){
    }

    //First I need to check the conditions
    public boolean addItem(Item item, int quantity){
        if(item == null || quantity <= 0)
            return false;

        for(ItemStack stack : inventory) {
            int space = stack.getMaxQuantity() - stack.getQuantity();
            if (stack.hasItem(item)) {
                if (quantity <= space) {
                    stack.setQuantity(stack.getQuantity() + quantity);
                    return true;
                }
                stack.setQuantity((stack.getQuantity() + space));
                quantity -= space;
            }
        }
        while (quantity > 64){
            inventory.add(new ItemStack(item, 64));
            quantity -= 64;
        }
        inventory.add(new ItemStack(item, quantity));
        return true;
    }
    public boolean getContent(){
        for(ItemStack stack : inventory){
            System.out.println(stack.getItem().getName() + "x" + stack.getQuantity());
        }
        return true;
    }
}
