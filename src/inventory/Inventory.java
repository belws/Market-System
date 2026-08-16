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
        //Loop through inventory
        for(ItemStack stack : inventory){
            //If this item exists in a stack we only modify the quantity
            if(stack.hasItem(item)){
                stack.setQuantity(stack.getQuantity() + quantity);
                return true;
            }
        }


        //Might handle inventory size later


        //We create a new stack if the item doesnt exist yet
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
